package irvine.math.plantri;

import java.util.Arrays;

import irvine.math.MutableInteger;

/**
 * The main node of the recursion for creating double edges.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
class DoubleScanner {

  private final Plantri mPlantri;
  private final PlantriGraphState mState;
  private final int[] mDegree;
  private final Edge[] mEdges;
  private final Edge[] mFirstEdge;
  private final Numbering mNumbering;
  private final Marks mVertexMarks;
  private final Edge[] mDoubles = new Edge[Plantri.MAX_EDGES];  /* holds edges with parallel mates */
  // The following packed adjacency matrix is used for triangulations of mMinConnec < 3.
  private final long[] mAdjMatix = new long[Plantri.MAX_VERTICES];

  DoubleScanner(final Plantri plantri, final Numbering numbering, final Marks vertexMarks) {
    mPlantri = plantri;
    mState = plantri.getState();
    mDegree = mState.mDegree;
    mEdges = mState.mEdges;
    mFirstEdge = mState.mFirstEdge;
    mNumbering = numbering;
    mVertexMarks = vertexMarks;
  }

  private static long bit(final int i) {
    return 1L << i;
  }

  private boolean isAdjacent(final int i, final int j) {
    return (mAdjMatix[i] & bit(j)) != 0;
  }

  /* Put into list[] the edges that can be flipped to make a new
     doubled edge.  Put in deList[] an example of an edge which
     will be in parallel with it after it is flipped.  Put in
     *number the number of such things.  All edges are in mMin form. */
  private int findDoubleMakers(final Edge[] list, final Edge[] deList) {
    final int degneeded = mPlantri.getMinDegree() == 3 ? 4 : 3;
    int num = 0;
    for (int i = 0; i < mState.mNumVertices; ++i) {
      if (mDegree[i] >= degneeded) {
        Edge run = mFirstEdge[i];
        for (int j = mDegree[i]; j != 0; --j, run = run.mNext) {
          if (run == run.mMin && mDegree[run.mEnd] >= degneeded) {
            if (isAdjacent(run.mNext.mEnd, run.mPrev.mEnd)) {
              list[num] = run;
              deList[num++] = findEdgeEnd(mFirstEdge[run.mNext.mEnd], run.mPrev.mEnd).mMin;
            }
          }
        }
      }
    }
    return num;
  }

  private static Edge findEdgeEnd(final Edge start, final int target) {
    Edge edge = start;
    while (edge.mEnd != target) {
      edge = edge.mNext;
    }
    return edge;
  }

  private int updateCounter(final Edge[] list, final Edge[] deList, final int degNeeded, final int v, int counter) {
    if (mDegree[v] >= degNeeded) {
      Edge run = mFirstEdge[v];
      for (int j = mDegree[v]; j != 0; --j, run = run.mNext) {
        if (mDegree[run.mEnd] >= degNeeded && (run == run.mMin || !mVertexMarks.isMarkedVertex(run.mEnd))) {
          // Edges inside the set are regarded twice, so only one of the
          // directions should be worked on, edges leaving the set are
          // regarded only once.
          if (isAdjacent(run.mNext.mEnd, run.mPrev.mEnd)) {
            list[counter] = run.mMin;
            deList[counter++] = findEdgeEnd(mFirstEdge[run.mNext.mEnd], run.mPrev.mEnd).mMin;
          }
        }
      }
    }
    return counter;
  }

  /* Add more comments.  All edges in the parameters are in min form. */
  private int updateDoubleMakers(final Edge[] list, final Edge[] deList,
                                        final Edge[] oldList, final int oldNumber, final Edge[] oldDeList, final Edge lastFlipped) {
    final int degNeeded = mPlantri.getMinDegree() == 3 ? 4 : 3;

    mVertexMarks.resetMarksVertex();
    final int a = lastFlipped.mStart;
    mVertexMarks.markVertex(a);
    final int b = lastFlipped.mEnd;
    mVertexMarks.markVertex(b);
    final int c = lastFlipped.mPrev.mEnd;
    mVertexMarks.markVertex(c);
    final int d = lastFlipped.mNext.mEnd;
    mVertexMarks.markVertex(d);

    /* abcd must all be distinct, since with lastFlipped before and after the
       flipping all edges of K_4 are present, so there would have been a loop
       before or after -- but so far there are no loops... */
    int listLength = 0;

    for (int i = 0; i < oldNumber; ++i) {
      final Edge run = oldList[i];
      if (lastFlipped != oldDeList[i] && !(mVertexMarks.isMarkedVertex(run.mStart) || mVertexMarks.isMarkedVertex(run.mEnd))) {
        /* In this case it will be checked from abcd */
        /* The other thing to check is that the edge to be doubled was not switched away */
        list[listLength] = run;
        deList[listLength++] = oldDeList[i];
      }
      /* If it was switched away, there is NO other edge that would be
         doubled, since this would mean that already the edge switched
         away was in a double edge and edges contained in double edges
         are never switched away, since they cannot double another
         (Jordan Curve Theorem). */
    }

    /* Note: It is not possible that some edge not adjacent to abcd can double
       lastFlipped in its new position and is not yet included in the old list:
       LastFlipped was flipped in order to double some edge, so there already
       was some edge with these endpoints to double. */
    listLength = updateCounter(list, deList, degNeeded, a, listLength);
    listLength = updateCounter(list, deList, degNeeded, b, listLength);
    listLength = updateCounter(list, deList, degNeeded, c, listLength);
    return updateCounter(list, deList, degNeeded, d, listLength);
  }

  /* For i=0..count-1, set feasible[i]=1 if flip[i] is the first in its
     edge orbit in flip[0..count-1], and feasible[i]=0 otherwise.
     Also set feasible[i]=0 if flip[i] will definitely have a worse
     colour than mate[i] after flipping. */
  private void findFeasibleFlips(final Edge[] flip, final Edge[] mate, final int count, final int[] feasible, final int nbTot) {
    if (nbTot == 1) {
      Arrays.fill(feasible, 0, count, 1);
    } else {
      final EdgeFactory ef = mPlantri.mEdgeFactory;
      mNumbering.resetToIdentity(mState.mNumEdges);
      ef.resetMarks(mEdges);
      for (int i = 0; i < count; ++i) {
        final int q = flip[i].mIndex;
        if (!ef.isMarkedLo(mNumbering.get(0, q))) {
          feasible[i] = 1;
          mNumbering.minMarkLo(0, nbTot, q);
        } else {
          feasible[i] = 0;
        }
      }
    }

    for (int i = 0; i < count; ++i) {
      if (feasible[i] != 0) {
        final int mateside1 = mate[i].mNext.mEnd;
        final int mateside2 = mate[i].mPrev.mEnd;
        final int flipside1 = flip[i].mStart;
        final int flipside2 = flip[i].mEnd;
        final int flipcol = mDegree[flipside1] + mDegree[flipside2] - 2;
        int matecol = mDegree[mateside1] + mDegree[mateside2];

        if (matecol < flipcol) {
          feasible[i] = 0;
        } else {
          if (mateside1 == flipside1 || mateside1 == flipside2) {
            --matecol;
          }
          if (mateside2 == flipside1 || mateside2 == flipside2) {
            --matecol;
          }
          if (matecol < flipcol) {
            feasible[i] = 0;
          }
        }
      }
    }
  }

  private void makeAdjMatrix() {
    for (int k = 0; k < mState.mNumVertices; ++k) {
      long ami = 0;
      final Edge ex = mFirstEdge[k];
      Edge e = ex;
      do {
        ami |= bit(e.mEnd);
        e = e.mNext;
      } while (e != ex);
      mAdjMatix[k] = ami;
    }
  }

  /* The main node of the recursion for creating double edges.
     As this procedure is entered, mState.mNumVertices,mState.mNumEdges,degree etc are set for some graph,
     and nbTot/nbOp are the values returned by canon() for that graph.
     numDoubles is the number of undirected edges with a parallel mate.
     oldflip and oldnflip are the flips for the parent graph, and lastFlip
     is what was flipped to make this graph.  The initial call is
     distinguished by oldnflip==0.  There are no loops yet. */
  void scan(final int nbTot, final int nbOp, final int numDoubles,
            final Edge[] oldflip, final Edge[] oldmate, final int oldnflip, final Edge lastFlip) {
    final Edge[] flip = new Edge[Plantri.MAX_EDGES / 2];
    final Edge[] mate = new Edge[Plantri.MAX_EDGES / 2];
    final Edge[] good = new Edge[Plantri.MAX_EDGES];
    final int[] feasible = new int[Plantri.MAX_EDGES / 2];

    if (mPlantri.getMinConnectivity() == 2) {
      mPlantri.gotOne(nbTot, nbOp, 2 + (numDoubles == 0 ? 1 : 0));
    }

    final int numFlips;
    if (oldnflip == 0) {
      makeAdjMatrix();
      numFlips = findDoubleMakers(flip, mate);
    } else {
      numFlips = updateDoubleMakers(flip, mate, oldflip, oldnflip, oldmate, lastFlip);
    }

    findFeasibleFlips(flip, mate, numFlips, feasible, nbTot);

    if (mPlantri.getMinConnectivity() == 1) {
      //scanordloops(nbTot, nbOp, numDoubles);
      throw new UnsupportedOperationException();
    }

    for (int i = 0; i < numFlips; ++i) {
      if (feasible[i] == 0) {
        continue;
      }

      final int a = flip[i].mStart;
      final long ama = mAdjMatix[a];
      final int b = flip[i].mEnd;
      final long amb = mAdjMatix[b];
      final int c = flip[i].mPrev.mEnd;
      final long amc = mAdjMatix[c];
      final int d = flip[i].mNext.mEnd;
      final long amd = mAdjMatix[d];
      mAdjMatix[a] = ama & ~bit(b);
      mAdjMatix[b] = amb & ~bit(a);
      mAdjMatix[c] = amc | bit(d);
      mAdjMatix[d] = amd | bit(c);
      mPlantri.mSwitcher.switchEdge(flip[i]);

      mDoubles[numDoubles] = flip[i];
      int j;
      for (j = 0; j < numDoubles; ++j) {
        if (mDoubles[j] == mate[i]) {
          break;
        }
      }
      final int xnumDoubles;
      if (j == numDoubles) {
        mDoubles[numDoubles + 1] = mate[i];
        xnumDoubles = numDoubles + 2;
      } else {
        xnumDoubles = numDoubles + 1;
      }
      final int nGood = EdgeColour.makeEdgeColours(mDegree, flip[i], mDoubles, xnumDoubles, good);

      final MutableInteger xnbTot = new MutableInteger();
      final MutableInteger xnbOp = new MutableInteger();
      if (nGood > 0 && Canon.canonEdge(mPlantri, good, nGood, mDegree, mNumbering, xnbTot, xnbOp)) {
        scan(xnbTot.get(), xnbOp.get(), xnumDoubles, flip, mate, numFlips, flip[i]);
      }
      mAdjMatix[a] = ama;
      mAdjMatix[b] = amb;
      mAdjMatix[c] = amc;
      mAdjMatix[d] = amd;
      mPlantri.mSwitcher.switchEdgeBack(flip[i]);
    }
  }

}
