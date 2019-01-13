package irvine.math.plantri;

import irvine.math.MutableInteger;

/**
 * Canonical testing.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
final class Canon {

  private Canon() { }

  /* Checks whether the last vertex (number: mState.mNumVertices-1) is canonical or not.
       Returns true if yes, false if not. One of the criteria a canonical vertex
       must fulfill is that its colour is minimal.

       It is assumed that the values of the colour function are positive
       and at most INT_MAX-MAX_VERTICES.

       A possible starting edge for the construction of a representation is
       one with lexicographically minimal colour pair (mStart,INT_MAX-mEnd).
       In canNumberings[][] the canonical numberings are stored as sequences
       of oriented edges.  For every 0 <= i,j < nbTot and every
       0 <= k < mState.mNumEdges the edges canNumberings[i][k] and canNumberings[j][k] can
       be mapped onto each other by an automorphism. The first
       nbOp numberings are orientation preserving while
       the rest is orientation reversing.

       In case of only 1 automorphism, in canNumberings[0][0] the "canonical"
       edge is given.  It is one edge emanating at the canonical vertex. The
       rest of the numbering is not given.

       In case of nontrivial automorphisms, can[0] starts with a list of edges
       adjacent to numVertices-1. In case of an orientation preserving numbering the edges
       are listed in .mNext direction, otherwise in .mPrev direction.

       Works OK if at least one vertex has valence >= 3. Otherwise some numberings
       are computed twice, since changing the orientation (the cyclic order around
       each vertex) doesn't change anything. */
  static boolean canon(final Plantri plantri, final Edge[] firstEdge, final int[] lColour, final Numbering canNumberings, final MutableInteger nbTot, final MutableInteger nbOp) {
    final PlantriGraphState state = plantri.getState();
    final int numVertices = state.mNumVertices;
    final Edge[] startListLast = new Edge[5];
    final Edge[] startList = new Edge[5 * Plantri.MAX_VERTICES];
    final int[] representation = new int[Plantri.MAX_EDGES];
    final Edge[] numblist = new Edge[Plantri.MAX_EDGES];
    final Edge[] numblistMirror = new Edge[Plantri.MAX_EDGES];
    // lists of edges where starting gives a canonical representation
    int numbs = 1;
    int numbsMirror = 0;
    final int[] colour = getColours(lColour, numVertices);
    // to distinguish colours from vertices
    final int lastVertex = numVertices - 1;
    final int minStart = colour[lastVertex]; // (minStart,maxEnd) will be the chosen colour pair of an edge

    // determine the smallest possible end for the vertex "lastVertex"

    int listLengthLast = 1;
    Edge end = firstEdge[lastVertex];
    startListLast[0] = end;
    int maxEnd = colour[end.mEnd];

    for (Edge run = end.mNext; run != end; run = run.mNext) {
      if (colour[run.mEnd] > maxEnd) {
        startListLast[0] = run;
        listLengthLast = 1;
        maxEnd = colour[run.mEnd];
      } else if (colour[run.mEnd] == maxEnd) {
        startListLast[listLengthLast++] = run;
      }
    }

    // Now we know the pair that SHOULD be minimal and we can determine a list
    // of all edges with this colour pair. If a new pair is found that is even
    // smaller, we can return 0 at once
    int listLength = 0;
    for (int i = 0; i < lastVertex; ++i) {
      if (colour[i] < minStart) {
        return false;
      }
      if (colour[i] == minStart) {
        Edge run = end = firstEdge[i];
        do {
          if (colour[run.mEnd] > maxEnd) {
            return false;
          }
          if (colour[run.mEnd] == maxEnd) {
            startList[listLength++] = run;
          }
          run = run.mNext;
        } while (run != end);
      }
    }

    // OK -- so there is no smaller pair and now we have to determine the
    // smallest representation around vertex "lastVertex":
    TestCanonicalization.testCanonFirstInit(numVertices, startListLast[0], representation, colour);
    numblist[0] = startListLast[0];
    int test = TestCanonicalization.testCanonMirrorInit(numVertices, startListLast[0], representation, colour);
    if (test == 1) {
      numbsMirror = 1;
      numblistMirror[0] = startListLast[0];
    } else if (test == 2) {
      numbsMirror = 1;
      numbs = 0;
      numblistMirror[0] = startListLast[0];
    }

    for (int i = 1; i < listLengthLast; ++i) {
      test = TestCanonicalization.testCanonInit(numVertices, startListLast[i], representation, colour);
      if (test == 1) {
        numblist[numbs] = startListLast[i];
        ++numbs;
      } else if (test == 2) {
        numbsMirror = 0;
        numbs = 1;
        numblist[0] = startListLast[i];
      }
      test = TestCanonicalization.testCanonMirrorInit(numVertices, startListLast[i], representation, colour);
      if (test == 1) {
        numblistMirror[numbsMirror++] = startListLast[i];
      } else if (test == 2) {
        numbsMirror = 1;
        numbs = 0;
        numblistMirror[0] = startListLast[i];
      }
    }

    // Now we know the best representation we can obtain starting at lastVertex.
    // Now we will check all the others. We can return 0 at once if we find a
    // better one

    for (int i = 0; i < listLength; ++i) {
      test = TestCanonicalization.testCanon(numVertices, startList[i], representation, colour);
      if (test == 1) {
        numblist[numbs++] = startList[i];
      } else if (test == 2) {
        return false;
      }
      test = TestCanonicalization.testCanonMirror(numVertices, startList[i], representation, colour);
      if (test == 1) {
        numblistMirror[numbsMirror] = startList[i];
        ++numbsMirror;
      } else if (test == 2) {
        return false;
      }
    }

    nbOp.set(numbs);
    nbTot.set(numbs + numbsMirror);

    if (nbTot.get() > 1) {
      for (int i = 0; i < numbs; ++i) {
        constructNumb(numVertices, state.mNumEdges, numblist[i], canNumberings.get(i), plantri.mVertexMarks);
      }
      for (int i = 0; i < numbsMirror; ++i, ++numbs) {
        constructNumbMirror(numVertices, state.mNumEdges, numblistMirror[i], canNumberings.get(numbs), plantri.mVertexMarks);
      }
    } else {
      if (numbs != 0) {
        canNumberings.set(0, 0, numblist[0]);
      } else {
        canNumberings.set(0, 0, numblistMirror[0]);
      }
    }
    return true;
  }

  private static int[] getColours(final int[] lColour, final int numVertices) {
    final int[] colour = new int[numVertices];
    for (int k = 0; k < colour.length; ++k) {
      colour[k] = lColour[k] + Plantri.MAX_VERTICES;
    }
    return colour;
  }

  /*
       IT IS ASSUMED that the values of the colour function are positive and
       at most INT_MAX-MAX_VERTICES.

       In case edgeList[0] == edgeList[1].inverse, it checks whether
       edgeList[0] or edgeList[1] are canonical. Otherwise only
       edgeList[0] is checked to be canonical.

       It is only compared with the other edges contained in edgeList.
       The number of those edges in the list is given in numEdges.
       Returns 1 if yes, 0 if not.

       Edges given are not in minimal form -- but it is guaranteed that all
       colours of the startpoints are the same and all colours of the endpoints
       are the same.

       In case of only the identity automorphism, the entries of canNumberings[][]
       are undefined.

       Otherwise in canNumberings[][] the canonical numberings are stored as
       sequences of oriented edges.  For every 0 <= i,j < *nbTot
       and every 0 <= k < mState.mNumEdges the edges canNumberings[i][k] and
       canNumberings[j][k] can be mapped onto each other by an automorphism.
       The first *nbOp numberings are orientation
       preserving while the rest are orientation reversing.

       In case of an orientation preserving numbering the edges are listed in
       .mNext direction, otherwise in .mPrev direction.

       Works OK if at least one vertex has valence >= 3. Otherwise some numberings
       are computed twice, since changing the orientation (the cyclic order around
       each vertex) doesn't change anything */
  static boolean canonEdge(final Plantri plantri, final Edge[] edgeList, final int numEdges,
                           final int[] lColour, final Numbering canNumberings,
                           final MutableInteger nbTot, final MutableInteger nbOp) {
    final PlantriGraphState state = plantri.getState();
    final int numVertices = state.mNumVertices;
    final int[] representation = new int[Plantri.MAX_EDGES];
    final Edge[] numblist = new Edge[Plantri.MAX_EDGES];
    final Edge[] numblistMirror = new Edge[Plantri.MAX_EDGES]; // lists of edges where starting gives a canonical representation
    int numbs = 1;
    int numbsMirror = 0;
    final int[] colour = getColours(lColour, numVertices);
    // to distinguish colours from vertices

    // First we have to determine the smallest representation of edgeList[0]
    TestCanonicalization.testCanonFirstInit(numVertices, edgeList[0], representation, colour);
    numblist[0] = edgeList[0];
    int test = TestCanonicalization.testCanonMirrorInit(numVertices, edgeList[0], representation, colour);
    if (test == 1) {
      numbsMirror = 1;
      numblistMirror[0] = edgeList[0];
    } else if (test == 2) {
      numbsMirror = 1;
      numbs = 0;
      numblistMirror[0] = edgeList[0];
    }

    int i;
    if (numEdges > 1 && edgeList[0] == edgeList[1].mInverse) {
      test = TestCanonicalization.testCanonInit(numVertices, edgeList[1], representation, colour);
      if (test == 1) {
        numblist[numbs++] = edgeList[1];
      } else if (test == 2) {
        numbsMirror = 0;
        numbs = 1;
        numblist[0] = edgeList[1];
      }
      test = TestCanonicalization.testCanonMirrorInit(numVertices, edgeList[1], representation, colour);
      if (test == 1) {
        numblistMirror[numbsMirror] = edgeList[1];
        ++numbsMirror;
      } else if (test == 2) {
        numbsMirror = 1;
        numbs = 0;
        numblistMirror[0] = edgeList[1];
      }
      i = 2; // start rejecting at the second entry
    } else {
      i = 1; // start rejecting at the first entry
    }
    /* Now we know the best representation we can obtain with testEdge.
       Next we will check all the others. We can return 0 at once if we find a
       better one */

    for (; i < numEdges; ++i) {
      test = TestCanonicalization.testCanon(numVertices, edgeList[i], representation, colour);
      if (test == 1) {
        numblist[numbs++] = edgeList[i];
      } else if (test == 2) {
        return false;
      }
      test = TestCanonicalization.testCanonMirror(numVertices, edgeList[i], representation, colour);
      if (test == 1) {
        numblistMirror[numbsMirror++] = edgeList[i];
      } else if (test == 2) {
        return false;
      }
    }

    nbOp.set(numbs);
    nbTot.set(numbs + numbsMirror);

    if (nbTot.get() > 1) {
      for (i = 0; i < numbs; ++i) {
        constructNumb(numVertices, state.mNumEdges, numblist[i], canNumberings.get(i), plantri.mVertexMarks);
      }
      for (i = 0; i < numbsMirror; ++i, ++numbs) {
        constructNumbMirror(numVertices, state.mNumEdges, numblistMirror[i], canNumberings.get(numbs), plantri.mVertexMarks);
      }
    }

    return true;
  }

  /*
       IT IS ASSUMED that the values of the colour function are positive
       and at most INT_MAX-MAX_VERTICES.

       This routine checks all numEdgesOr elements of edgeListOr just for one
       orientation and all numEdgesInv elements of the list edgeListInv just
       for the other. It returns 1 if and only if one of the first canEdgesOr
       elements of the first list or first canEdgesInv elements of the second
       give an optimal numbering among all the possibilities provided by the
       lists.

       Edges given are not in minimal form -- but it is guaranteed that all
       colours of the startpoints are the same and all colours of the endpoints
       are the same.

       In case of only the identity automorphism, the entries of canNumberings[][]
       are undefined.

       Otherwise in canNumberings[][] the canonical numberings are stored as
       sequences of oriented edges.  For every 0 <= i,j < *nbTot
       and every 0 <= k < mState.mNumEdges the edges canNumberings[i][k] and
       canNumberings[j][k] can be mapped onto each other by an automorphism.
       The first *nbOp numberings are orientation
       preserving while the rest are orientation reversing.

       In case of an orientation preserving numbering the edges are listed in
       .mNext direction, otherwise in .mPrev direction.

       Works OK if at least one vertex has valence >= 3. Otherwise some numberings
       are computed twice, since changing the orientation (the cyclic order around
       each vertex) doesn't change anything */
  static boolean canonEdgeOriented(final Plantri plantri, final Edge[] edgeListOr, final int numEdgesOr, final int canEdgesOr,
                                   final Edge[] edgeListInv, final int numEdgesInv, final int canEdgesInv,
                                   final int[] lcolour, final Numbering canNumberings,
                                   final MutableInteger nbTot, final MutableInteger nbOp) {
    final PlantriGraphState state = plantri.getState();
    final int numVertices = state.mNumVertices;
    final int[] representation = new int[Plantri.MAX_EDGES];
    final Edge[] numblist = new Edge[Plantri.MAX_EDGES];
    final Edge[] numblistMirror = new Edge[Plantri.MAX_EDGES]; // lists of edges where starting gives a canonical representation
    int numbs = 1;
    int numbsMirror = 0;
    final int[] colour = getColours(lcolour, numVertices);
    // to distinguish colours from vertices

    // First we have to determine the smallest representation possible with edgeListOr
    int i;
    if (canEdgesOr > 0) {
      TestCanonicalization.testCanonFirstInit(numVertices, edgeListOr[0], representation, colour);
      numblist[0] = edgeListOr[0];
      for (i = 1; i < canEdgesOr; ++i) {
        final int test = TestCanonicalization.testCanonInit(numVertices, edgeListOr[i], representation, colour);
        if (test == 1) {
          numblist[numbs++] = edgeListOr[i];
        } else if (test == 2) {
          numbs = 1;
          numblist[0] = edgeListOr[i];
        }
      }
      i = 0; // the next for-loop can start at the beginning
    } else {
      numbs = 0;
      numbsMirror = 1;
      TestCanonicalization.testCanonFirstInitMirror(numVertices, edgeListInv[0], representation, colour);
      numblistMirror[0] = edgeListInv[0];
      i = 1; // the next for-loop must start at position 1
    }

    for (; i < canEdgesInv; ++i) {
      final int test = TestCanonicalization.testCanonMirrorInit(numVertices, edgeListInv[i], representation, colour);
      if (test == 1) {
        numblistMirror[numbsMirror++] = edgeListInv[i];
      } else if (test == 2) {
        numbs = 0;
        numbsMirror = 1;
        numblistMirror[0] = edgeListInv[i];
      }
    }


    /* Now we know the best we can get for a "canonical edge".
       Next we will check all the others. We can return 0 at once if we find a
       better one */
    for (i = canEdgesOr; i < numEdgesOr; ++i) {
      final int test = TestCanonicalization.testCanon(numVertices, edgeListOr[i], representation, colour);
      if (test == 1) {
        numblist[numbs++] = edgeListOr[i];
      } else if (test == 2) {
        return false;
      }
    }
    for (i = canEdgesInv; i < numEdgesInv; ++i) {
      final int test = TestCanonicalization.testCanonMirror(numVertices, edgeListInv[i], representation, colour);
      if (test == 1) {
        numblistMirror[numbsMirror++] = edgeListInv[i];
      } else if (test == 2) {
        return false;
      }
    }

    nbOp.set(numbs);
    nbTot.set(numbs + numbsMirror);

    if (nbTot.get() > 1) {
      for (i = 0; i < numbs; ++i) {
        constructNumb(numVertices, state.mNumEdges, numblist[i], canNumberings.get(i), plantri.mVertexMarks);
      }
      for (i = 0; i < numbsMirror; ++i, ++numbs) {
        constructNumbMirror(numVertices, state.mNumEdges, numblistMirror[i], canNumberings.get(numbs), plantri.mVertexMarks);
      }
    }

    return true;
  }

  /* Starts at givenEdge and writes the edges in the well defined order
       into the list.  Works like testCanon. Look there for comments. */
  private static void constructNumb(final int numVertices, final int numEdges, final Edge givenEdge, final Edge[] numbering, final Marks vertexMarks) {
    final Edge[] startEdge = new Edge[Plantri.MAX_VERTICES + 1];
    int lastNumber;

    vertexMarks.resetMarksVertex();

    int tail = 0;
    final int limit = numEdges - 1;

    vertexMarks.markVertex(givenEdge.mStart);
    if (givenEdge.mStart != givenEdge.mEnd) {
      vertexMarks.markVertex(givenEdge.mEnd);
      lastNumber = 2;
      startEdge[1] = givenEdge.mInverse;
    } else {
      lastNumber = 1;
    }

    int actualNumber = 1;
    Edge temp = numbering[tail] = givenEdge;

    while (lastNumber < numVertices) {
      for (Edge run = temp.mNext; run != temp; run = run.mNext) {
        // this loop marks all edges around temp.origin.
        final int vertex = run.mEnd;
        if (!vertexMarks.isMarkedVertex(vertex)) {
          startEdge[lastNumber++] = run.mInverse;
          vertexMarks.markVertex(vertex);
        }
        numbering[++tail] = run;
      }
      if (tail != limit) {
        numbering[++tail] = temp = startEdge[actualNumber++];
      }
    }

    while (tail != limit) {
      // Now we know that all numbers have been given
      for (Edge run = temp.mNext; run != temp; run = run.mNext) {
        // this loop marks all edges around temp.origin.
        numbering[++tail] = run;
      }
      if (tail != limit) {
        // Next vertex to explore:
        numbering[++tail] = temp = startEdge[actualNumber++];
      }
    }
  }

  /* Starts at givenEdge and writes the edges in the well defined order
       into the list.  Works like testCanon. Look there for comments.  */
  private static void constructNumbMirror(final int numVertices, final int numEdges, final Edge givenEdge, final Edge[] numbering, final Marks vertexMarks) {
    final Edge[] startEdge = new Edge[Plantri.MAX_VERTICES + 1];
    int lastNumber;

    vertexMarks.resetMarksVertex();

    int tail = 0; // The first entry of the numbering list
    final int limit = numEdges - 1;  // Last valid entry of the numbering list

    vertexMarks.markVertex(givenEdge.mStart);
    if (givenEdge.mStart != givenEdge.mEnd) {
      vertexMarks.markVertex(givenEdge.mEnd);
      lastNumber = 2;
      startEdge[1] = givenEdge.mInverse;
    } else {
      lastNumber = 1;
    }

    int actualNumber = 1;
    Edge temp = numbering[tail] = givenEdge;

    while (lastNumber < numVertices) {
      for (Edge run = temp.mPrev; run != temp; run = run.mPrev) {
        // this loop marks all edges around temp.origin.
        final int vertex = run.mEnd;
        if (!vertexMarks.isMarkedVertex(vertex)) {
          startEdge[lastNumber++] = run.mInverse;
          vertexMarks.markVertex(vertex);
        }
        numbering[++tail] = run;
      }
      if (tail != limit) {
        numbering[++tail] = temp = startEdge[actualNumber++];
      }
    }

    while (tail != limit) {
      // Now we know that all numbers have been given
      for (Edge run = temp.mPrev; run != temp; run = run.mPrev) {
        // this loop marks all edges around temp.origin.
        numbering[++tail] = run;
      }
      if (tail != limit) {
        // Next vertex to explore:
        numbering[++tail] = temp = startEdge[actualNumber++];
      }
    }
  }
}
