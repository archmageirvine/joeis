package irvine.math.plantri;

/**
 * Routines for testing canonicalization.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
final class TestCanonicalization {

  private TestCanonicalization() { }

  /* Tests whether starting from a given edge and constructing the code in
       ".mNext" direction, an automorphism or even a better representation
       can be found. Returns 0 for failure, 1 for an automorphism and 2 for
       a better representation.  This function exits as soon as a better
       representation is found. A function that computes and returns the
       complete better representation can work pretty similar.*/
  static int testCanon(final int numVertices, final Edge givenEdge, final int[] representation, final int[] colour) {
    int r = 0;
    final Edge[] startEdge = new Edge[numVertices + 1];
    // startEdge[i] is the starting edge for exploring the vertex with the number i+1
    final int[] number = new int[numVertices];   /* The new numbers of the vertices, starting
                        at 1 in order to have "0" as a possibility to
                        mark ends of lists and not yet given numbers */

    number[givenEdge.mStart] = 1;

    int lastNumber;
    if (givenEdge.mStart != givenEdge.mEnd) /* no loop mStart */ {
      number[givenEdge.mEnd] = 2;
      lastNumber = 2;
      startEdge[1] = givenEdge.mInverse;
    } else {
      lastNumber = 1;
    }

    int actualNumber = 1;
    Edge temp = givenEdge;

  /* A representation is a clockwise ordering of all neighbours ended with a 0.
   The neighbours are numbered in the order that they are reached by the BFS
   procedure. In case a vertex is reached for the first time, not the (new)
   number of the vertex is listed, but its colour. When the list around a
   vertex is finished, it is ended with a 0. Since the colours can be
   distinguished from the vertices (requirement for the colour function), the
   adjacency list can be reconstructed: Every time a colour is listed, its
   number would be the smallest number not given yet.
   Since the edges when a vertex is reached for the first time are remembered,
   for these edges we in fact have more than just the vertex information -- for
   these edges we also have the exact information which edge occurs in the
   cyclic order. This makes the routine work also for double edges.

   Since every representation starts with the colour of vertex 2, which is
   the same colour all the time, we do not have to store that.

   In case of a loop as the starting point, the colour of 1 is omitted.
   Nevertheless also in this case it cannot be mixed up with a non-loop
   starting point, since the number of times a colour occurs is larger
   for loop starters than for non-loop starters.

   Every first entry in a new clockwise ordering (the starting point of the
   edge it was numbered from is determined by the entries before (the first
   time it occurs in the list to be exact), so this is not given either.
   The K4 could be denoted  c3 c4 0 4 3 0 2 3 0 3 2 0 if ci is the colour
   of vertex i.  Note that the colour of vertex 1 is -- by definition --
   always the smallest one */

    while (lastNumber < numVertices) {
      for (Edge run = temp.mNext; run != temp; run = run.mNext) {
        // this loop marks all edges around temp.origin.
        int vertex = run.mEnd;
        if (number[vertex] == 0) {
          startEdge[lastNumber++] = run.mInverse;
          number[vertex] = lastNumber;
          vertex = colour[vertex];
        } else {
          vertex = number[vertex];
        }
        if (vertex > representation[r]) {
          return 0;
        }
        if (vertex < representation[r]) {
          return 2;
        }
        ++r;
      }
      // check whether representation[] is also at the mEnd of a cyclic list
      if (representation[r] != 0) {
        return 2;
      }
      ++r;
      // Next vertex to explore
      temp = startEdge[actualNumber++];
    }

    while (actualNumber <= numVertices) {
      // Now we know that all numbers have been given
      for (Edge run = temp.mNext; run != temp; run = run.mNext) {
        // this loop marks all edges around temp.origin.
        final int vertex = number[run.mEnd];
        if (vertex > representation[r]) {
          return 0;
        }
        if (vertex < representation[r]) {
          return 2;
        }
        ++r;
      }
      // check whether representation[] is also at the mEnd of a cyclic list
      if (representation[r] != 0) {
        return 2;
      }
      ++r;
      // Next vertex to explore:
      temp = startEdge[actualNumber++];
    }

    return 1;
  }

  /* Tests whether starting from a given edge and constructing the code in
       ".mPrev" direction, an automorphism or even a better representation can
       be found. Comments see testCanon -- it is exactly the same except for
       the orientation */
  static int testCanonMirror(final int numVertices, final Edge givenEdge, final int[] representation, final int[] colour) {
    int r = 0;
    final Edge[] startEdge = new Edge[numVertices + 1];
    final int[] number = new int[numVertices];

    number[givenEdge.mStart] = 1;

    int lastNumber;
    if (givenEdge.mStart != givenEdge.mEnd) {
      number[givenEdge.mEnd] = 2;
      lastNumber = 2;
      startEdge[1] = givenEdge.mInverse;
    } else {
      lastNumber = 1;
    }

    int actualNumber = 1;
    Edge temp = givenEdge;

    while (lastNumber < numVertices) {
      for (Edge run = temp.mPrev; run != temp; run = run.mPrev) {
        int vertex = run.mEnd;
        if (number[vertex] == 0) {
          startEdge[lastNumber++] = run.mInverse;
          number[vertex] = lastNumber;
          vertex = colour[vertex];
        } else {
          vertex = number[vertex];
        }
        if (vertex > representation[r]) {
          return 0;
        }
        if (vertex < representation[r]) {
          return 2;
        }
        ++r;
      }
      if (representation[r] != 0) {
        return 2;
      }
      ++r;
      temp = startEdge[actualNumber++];
    }

    while (actualNumber <= numVertices) {
      for (Edge run = temp.mPrev; run != temp; run = run.mPrev) {
        final int vertex = number[run.mEnd];
        if (vertex > representation[r]) {
          return 0;
        }
        if (vertex < representation[r]) {
          return 2;
        }
        ++r;
      }
      if (representation[r] != 0) {
        return 2;
      }
      ++r;
      temp = startEdge[actualNumber++];
    }

    return 1;
  }

  /* Tests whether starting from a given edge and constructing the code in
       ".mNext" direction, an automorphism or even a better representation can
       be found. A better representation will be completely constructed and
       returned in "representation".  It works pretty similar to testCanon except
       for obviously necessary changes, so for extensive comments see testCanon */
  static void testCanonFirstInit(final int numVertices, final Edge givenEdge, final int[] representation, final int[] colour) {
    int r = 0;
    final Edge[] startEdge = new Edge[numVertices + 1];
    final int[] number = new int[numVertices];
    int lastNumber;

    number[givenEdge.mStart] = 1;
    if (givenEdge.mStart != givenEdge.mEnd) {
      number[givenEdge.mEnd] = 2;
      lastNumber = 2;
      startEdge[1] = givenEdge.mInverse;
    } else {
      lastNumber = 1;
    }

    int actualNumber = 1;
    Edge temp = givenEdge;

    while (lastNumber < numVertices) {
      for (Edge run = temp.mNext; run != temp; run = run.mNext) {
        final int vertex = run.mEnd;
        if (number[vertex] == 0) {
          startEdge[lastNumber++] = run.mInverse;
          number[vertex] = lastNumber;
          representation[r] = colour[vertex];
        } else {
          representation[r] = number[vertex];
        }
        ++r;
      }
      representation[r++] = 0;
      temp = startEdge[actualNumber];
      ++actualNumber;
    }

    while (actualNumber <= numVertices) {
      for (Edge run = temp.mNext; run != temp; run = run.mNext) {
        representation[r++] = number[run.mEnd];
      }
      representation[r++] = 0;
      temp = startEdge[actualNumber++];
    }
  }

  /* Tests whether starting from a given edge and constructing the code in
       ".mPrev" direction, an automorphism or even a better representation can
       be found. A better representation will be completely constructed and
       returned in "representation".  It works pretty similar to testCanon except
       for obviously necessary changes, so for extensive comments see testCanon */
  static void testCanonFirstInitMirror(final int numVertices, final Edge givenEdge, final int[] representation, final int[] colour) {
    int r = 0;
    final Edge[] startEdge = new Edge[numVertices + 1];
    final int[] number = new int[numVertices];
    int lastNumber;

    number[givenEdge.mStart] = 1;
    if (givenEdge.mStart != givenEdge.mEnd) {
      number[givenEdge.mEnd] = 2;
      lastNumber = 2;
      startEdge[1] = givenEdge.mInverse;
    } else {
      lastNumber = 1;
    }

    int actualNumber = 1;
    Edge temp = givenEdge;

    while (lastNumber < numVertices) {
      for (Edge run = temp.mPrev; run != temp; run = run.mPrev) {
        final int vertex = run.mEnd;
        if (number[vertex] == 0) {
          startEdge[lastNumber++] = run.mInverse;
          number[vertex] = lastNumber;
          representation[r] = colour[vertex];
        } else {
          representation[r] = number[vertex];
        }
        ++r;
      }
      representation[r++] = 0;
      temp = startEdge[actualNumber++];
    }

    while (actualNumber <= numVertices) {
      for (Edge run = temp.mPrev; run != temp; run = run.mPrev) {
        representation[r++] = number[run.mEnd];
      }
      representation[r++] = 0;
      temp = startEdge[actualNumber++];
    }
  }

  /* Tests whether starting from a given edge and constructing the code in
       ".mNext" direction, an automorphism or even a better representation can
       be found. A better representation will be completely constructed and
       returned in "representation".  It works pretty similar to testCanon except
       for obviously necessary changes, so for extensive comments see testCanon */
  static int testCanonInit(final int numVertices, final Edge givenEdge, final int[] representation, final int[] colour) {
    int r = 0;
    final Edge[] startEdge = new Edge[numVertices + 1];
    final int[] number = new int[numVertices];
    boolean better = false; /* is the representation already better ? */
    int lastNumber;

    number[givenEdge.mStart] = 1;
    if (givenEdge.mStart != givenEdge.mEnd) {
      number[givenEdge.mEnd] = 2;
      lastNumber = 2;
      startEdge[1] = givenEdge.mInverse;
    } else {
      lastNumber = 1;
    }

    int actualNumber = 1;
    Edge temp = givenEdge;

    while (lastNumber < numVertices) {
      for (Edge run = temp.mNext; run != temp; run = run.mNext) {
        int vertex = run.mEnd;
        if (number[vertex] == 0) {
          startEdge[lastNumber++] = run.mInverse;
          number[vertex] = lastNumber;
          vertex = colour[vertex];
        } else {
          vertex = number[vertex];
        }
        if (better) {
          representation[r] = vertex;
        } else {
          if (vertex > representation[r]) {
            return 0;
          } else if (vertex < representation[r]) {
            better = true;
            representation[r] = vertex;
          }
        }
        ++r;
      }
      if (representation[r] != 0) {
        better = true;
        representation[r] = 0;
      }
      ++r;
      temp = startEdge[actualNumber++];
    }

    while (actualNumber <= numVertices) {
      for (Edge run = temp.mNext; run != temp; run = run.mNext) {
        final int vertex = number[run.mEnd];
        if (better) {
          representation[r] = vertex;
        } else {
          if (vertex > representation[r]) {
            return 0;
          }
          if (vertex < representation[r]) {
            better = true;
            representation[r] = vertex;
          }
        }
        ++r;
      }
      if (representation[r] != 0) {
        better = true;
        representation[r] = 0;
      }
      ++r;
      temp = startEdge[actualNumber++];
    }
    return better ? 2 : 1;
  }

  /* Tests whether starting from a given edge and constructing the code in
       ".mPrev" direction, an automorphism or even a better representation can
       be found. A better representation will be completely constructed and
       returned in "representation".  It works pretty similar to testCanon except
       for obviously necessary changes, so for extensive comments see testCanon */
  static int testCanonMirrorInit(final int numVertices, final Edge givenEdge, final int[] representation, final int[] colour) {
    int r = 0;
    final Edge[] startEdge = new Edge[numVertices + 1];
    final int[] number = new int[numVertices];
    boolean better = false; // is the representation already better ?
    int lastNumber;

    number[givenEdge.mStart] = 1;
    if (givenEdge.mStart != givenEdge.mEnd) {
      number[givenEdge.mEnd] = 2;
      lastNumber = 2;
      startEdge[1] = givenEdge.mInverse;
    } else {
      lastNumber = 1;
    }

    int actualNumber = 1;
    Edge temp = givenEdge;

    while (lastNumber < numVertices) {
      for (Edge run = temp.mPrev; run != temp; run = run.mPrev) {
        int vertex = run.mEnd;
        if (number[vertex] == 0) {
          startEdge[lastNumber++] = run.mInverse;
          number[vertex] = lastNumber;
          vertex = colour[vertex];
        } else {
          vertex = number[vertex];
        }
        if (better) {
          representation[r] = vertex;
        } else {
          if (vertex > representation[r]) {
            return 0;
          } else if (vertex < representation[r]) {
            better = true;
            representation[r] = vertex;
          }
        }
        ++r;
      }
      if (representation[r] != 0) {
        better = true;
        representation[r] = 0;
      }
      ++r;
      temp = startEdge[actualNumber++];
    }

    while (actualNumber <= numVertices) {
      for (Edge run = temp.mPrev; run != temp; run = run.mPrev) {
        final int vertex = number[run.mEnd];
        if (better) {
          representation[r] = vertex;
        } else {
          if (vertex > representation[r]) {
            return 0;
          }
          if (vertex < representation[r]) {
            better = true;
            representation[r] = vertex;
          }
        }
        ++r;
      }
      if (representation[r] != 0) {
        better = true;
        representation[r] = 0;
      }
      ++r;
      temp = startEdge[actualNumber];
      ++actualNumber;
    }

    return better ? 2 : 1;
  }
}
