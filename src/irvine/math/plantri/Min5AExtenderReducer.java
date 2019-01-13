package irvine.math.plantri;

import irvine.math.MutableInteger;

/**
 * Extends a graph in the way given by the type a extension for 5-connected triangulations.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
public class Min5AExtenderReducer {

  private final Plantri mPlantri;
  private final PlantriGraphState mState;
  private final Edge[] mEdges;
  private final Edge[] mFirstEdge;
  private final int[] mDegree;
  
  Min5AExtenderReducer(final Plantri plantri) {
    mPlantri = plantri;
    mState = plantri.getState();
    mEdges = mState.mEdges;
    mFirstEdge = mState.mFirstEdge;
    mDegree = mState.mDegree;
  }

  /* extends a graph in the way given by the type a extension for
       5-connected triangulations. The edges e1, e2 mStart at the same
       vertex and must have at least two edges on each of their sides.
  
       It returns the edge characterizing this operation.
    */
  Edge extendMin5A(final Edge e1, final Edge e2) {
    final Edge e3 = e1.mNext;
    final Edge e4 = e2.mPrev;
    final Edge e1i = e1.mInverse;
    final Edge e2i = e2.mInverse;
    final Edge work1 = e1i.mPrev;
    final Edge work2 = e2i.mNext;
    final int center = e1.mStart;
    final int end1 = e1.mEnd;
    final int end2 = e2.mEnd;

    final int start = EdgeCounts.min5A(mState.mNumVertices);
    mFirstEdge[center] = mEdges[start + 2];
    mFirstEdge[mState.mNumVertices] = mEdges[start + 1];

    int counter = 1;
    Edge run = e3;
    run.mStart = run.mInverse.mEnd = mState.mNumVertices;
    do {
      run = run.mNext;
      run.mStart = run.mInverse.mEnd = mState.mNumVertices;
      ++counter;
    } while (run != e4);

    mDegree[mState.mNumVertices] = counter + 3;
    mDegree[center] -= counter - 1;

    mEdges[start].mStart = end1;
    mEdges[start].mPrev = work1;
    mEdges[start].mNext = e1i;
    work1.mNext = e1i.mPrev = mEdges[start];
    mDegree[end1]++;

    run = mEdges[start + 1];
    run.mEnd = end1;
    run.mNext = e3;
    e3.mPrev = run;

    run = mEdges[start + 2];
    run.mStart = center;
    run.mNext = e2;
    run.mPrev = e1;
    e1.mNext = e2.mPrev = run;

    run = mEdges[start + 3];
    run.mEnd = center;

    run = mEdges[start + 4];
    run.mStart = end2;
    run.mPrev = e2i;
    run.mNext = work2;
    e2i.mNext = work2.mPrev = run;
    mDegree[end2]++;

    run = mEdges[start + 5];
    run.mEnd = end2;
    run.mPrev = e4;
    e4.mNext = run;

    mState.mNumVertices++;
    mState.mNumEdges += 6;

    return mEdges[start + 2]; /* It is the minimum of the two inverse edges */
  }

  /* reduces the graph previously extended by the type a extension for
       5-connected triangulations if the edge returned by the function is
       given as a parameter.
    */
  void reduceMin5A(Edge e) {
    final Edge e1 = e.mPrev;
    final Edge e2 = e.mNext;
    final Edge e1i = e1.mInverse;
    final Edge e2i = e2.mInverse;
    final Edge work1 = e1i.mPrev.mPrev;
    final Edge work2 = e2i.mNext.mNext;

    e = e.mInverse;
    final Edge e3 = e.mNext.mNext;
    final Edge e4 = e.mPrev.mPrev;
    final int center = e1.mStart;
    final int end1 = e1.mEnd;
    final int end2 = e2.mEnd;

    mFirstEdge[center] = e1;
    mFirstEdge[end1] = e1i;
    mFirstEdge[end2] = e2i;

    int counter = 1;
    Edge run = e3;
    run.mStart = run.mInverse.mEnd = center;
    do {
      run = run.mNext;
      run.mStart = run.mInverse.mEnd = center;
      ++counter;
    } while (run != e4);

    mDegree[center] += counter - 1;
    mDegree[end1]--;
    mDegree[end2]--;

    e1.mNext = e3;
    e3.mPrev = e1;
    e2.mPrev = e4;
    e4.mNext = e2;

    e1i.mPrev = work1;
    work1.mNext = e1i;
    e2i.mNext = work2;
    work2.mPrev = e2i;

    mState.mNumVertices--;
    mState.mNumEdges -= 6;
  }

  private static int pair(final int x, final int y) {
    return ((x + y) << 10) + x;
  }

  private static int upair(final int x, final int y) {
    return x < y ? pair(x, y) : pair(y, x);
  }

  /* The A-operation with reference edge *ref has just been performed.
       prevA[0..nprevA-1] are all earlier As since the last B or C.
       Make a list in goodOr[0..*nGoodOr-1] of the reference edges of
       legal A-reductions (oriented editions) that might be canonical,
       with the first *nGoodRef of those being ref.
       Make a list in goodMir[0..*nGoodMir-1] of the
       reference edges of legal four-reductions (mirror-image editions)
       that might be canonical, with the first *nGoodMirRef of those being
       ref.mNext.
       *nGoodRef and *nGoodMirRef might each be 0-2.  If they are
       both 0, nothing else need be correct.
       All the edges in goodOr[] and goodMir[] must mStart with the same
       vertex degree and mEnd with the same vertex degree (actually, colour
       as passed to canonEdgeOriented).
       A-reductions have a priority (colour) based on the degrees of the
       four central vertices.  It cannot be changed without changing
       extensions_min5 too.
    */
  void isLegal(final Edge ref, final Edge[] goodOr, final MutableInteger nGoodOr, final MutableInteger nGoodRef, final Edge[] goodMir, final MutableInteger nGoodMir, final MutableInteger nGoodMirRef, final Edge[] prevA, final int nprevA) {
    final EdgeFactory ef = mPlantri.mEdgeFactory;
    final int deg1 = mDegree[ref.mStart];
    final int deg2 = mDegree[ref.mEnd];
    final int deg3 = mDegree[ref.mPrev.mEnd];
    final int deg4 = mDegree[ref.mNext.mEnd];
    final long bestcol1 = upair(deg1, deg2);
    final long bestcol2 = upair(deg3, deg4);
    ef.resetMarks(mEdges);
    ef.markLo(ref);
    ef.markLo(ref.mInverse);
    int nor = 0;
    int nmir = 0;
    for (int i = nprevA; --i >= 0; ) {
      final Edge hint = prevA[i];
      ef.markLo(hint);
      ef.markLo(hint.mInverse);
      final int d3 = mDegree[hint.mPrev.mEnd];
      final int d4 = mDegree[hint.mNext.mEnd];
      if (d3 >= 6 && d4 >= 6) {
        // Theorem: The reference edges of the A-expansions since the most recent B- or C-expansion are not on essential 5-cycles.
        final int d1 = mDegree[hint.mStart];
        final int d2 = mDegree[hint.mEnd];
        final long col1 = upair(d1, d2);
        if (col1 == bestcol1) {
          final long col2 = upair(d3, d4);
          if (col2 > bestcol2) {
            nGoodRef.set(0);
            nGoodMirRef.set(0);
            return;
          } else if (col2 == bestcol2) {
            if (nor + nmir == 0) {
              if (deg1 >= deg2) {
                if (deg3 >= deg4) {
                  goodOr[nor++] = ref;
                }
                if (deg3 <= deg4) {
                  goodMir[nmir++] = ref;
                }
              }
              if (deg1 <= deg2) {
                if (deg3 <= deg4) {
                  goodOr[nor++] = ref.mInverse;
                }
                if (deg3 >= deg4) {
                  goodMir[nmir++] = ref.mInverse;
                }
              }
              nGoodRef.set(nor);
              nGoodMirRef.set(nmir);
            }
            if (d1 >= d2) {
              if (d3 >= d4) {
                goodOr[nor++] = hint;
              }
              if (d3 <= d4) {
                goodMir[nmir++] = hint;
              }
            }
            if (d1 <= d2) {
              if (d3 <= d4) {
                goodOr[nor++] = hint.mInverse;
              }
              if (d3 >= d4) {
                goodMir[nmir++] = hint.mInverse;
              }
            }
          }
        } else if (col1 > bestcol1) {
          nGoodRef.set(0);
          nGoodMirRef.set(0);
          return;
        }
      }
    }
    if (nor + nmir == 0) {
      if (deg1 >= deg2) {
        if (deg3 >= deg4) {
          goodOr[nor++] = ref;
        }
        if (deg3 <= deg4) {
          goodMir[nmir++] = ref;
        }
      }
      if (deg1 <= deg2) {
        if (deg3 <= deg4) {
          goodOr[nor++] = ref.mInverse;
        }
        if (deg3 >= deg4) {
          goodMir[nmir++] = ref.mInverse;
        }
      }
      nGoodRef.set(nor);
      nGoodMirRef.set(nmir);
    }
    if (nor > nGoodRef.get() || nmir > nGoodMirRef.get()) {
      final MutableInteger qnor = new MutableInteger(nor);
      final MutableInteger qnmir = new MutableInteger(nmir);
      Pruner.pruneOrientedLists(goodOr, qnor, nGoodRef, goodMir, qnmir, nGoodMirRef, mDegree);
      nor = qnor.get();
      nmir = qnmir.get();
    }
    if (nGoodRef.get() + nGoodMirRef.get() == 0) {
      return;
    }
    final int sumDeg12 = deg1 + deg2;
    final int minD1 = (sumDeg12 + 1) / 2;
    final int maxDeg12 = Math.max(deg1, deg2);
    for (int i = mState.mNumVertices; --i >= 0; ) {
      final int d1 = mDegree[i];
      if (d1 >= minD1) {
        final int mind2 = d1 <= maxDeg12 ? sumDeg12 - d1 : sumDeg12 - d1 + 1;
        final Edge eilast = mFirstEdge[i];
        Edge ei = eilast;
        do {
          final int d2 = mDegree[ei.mEnd];
          final int d3 = mDegree[ei.mPrev.mEnd];
          final int d4 = mDegree[ei.mNext.mEnd];
          if (d2 >= mind2 && d3 >= 6 && d4 >= 6 && !ef.isMarkedLo(ei)) {
            final long col1 = upair(d1, d2);
            if (col1 > bestcol1) {
              if (!mPlantri.onNf5Cycle(ei)) {
                nGoodRef.set(0);
                nGoodMirRef.set(0);
                return;
              }
            } else {
              final long col2 = upair(d3, d4);
              if (col2 > bestcol2) {
                if (!mPlantri.onNf5Cycle(ei)) {
                  nGoodRef.set(0);
                  nGoodMirRef.set(0);
                  return;
                }
              } else if (col2 == bestcol2 && !mPlantri.onNf5Cycle(ei)) {
                if (d1 >= d2) {
                  if (d3 >= d4) {
                    goodOr[nor++] = ei;
                  }
                  if (d3 <= d4) {
                    goodMir[nmir++] = ei;
                  }
                }
                if (d1 <= d2) {
                  if (d3 <= d4) {
                    goodOr[nor++] = ei.mInverse;
                  }
                  if (d3 >= d4) {
                    goodMir[nmir++] = ei.mInverse;
                  }
                }
              }
            }
          }
          ef.markLo(ei.mInverse);
          ei = ei.mNext;
        } while (ei != eilast);
      }
    }
    nGoodOr.set(nor);
    nGoodMir.set(nmir);
    if (nor > nGoodRef.get() || nmir > nGoodMirRef.get()) {
      Pruner.pruneOrientedLists(goodOr, nGoodOr, nGoodRef, goodMir, nGoodMir, nGoodMirRef, mDegree);
    }
  }

  /* Test if the graph has an A-reduction */
  boolean hasMin5A() {
    for (int i = 0; i < mState.mNumVertices; ++i) {
      final Edge eLast = mFirstEdge[i];
      Edge e = eLast;
      do {
        if (e == e.mMin && mDegree[e.mNext.mEnd] >= 6
          && mDegree[e.mPrev.mEnd] >= 6 && !mPlantri.onNf5Cycle(e)) {
          return true;
        }
        e = e.mNext;
      } while (e != eLast);
    }
    return false;
  }

}
