package irvine.math.plantri;

import irvine.math.MutableInteger;

/**
 * Find extensions.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
public class Min5ExtensionFinder {

  private final Plantri mPlantri;
  private final PlantriGraphState mState;
  private final int[] mDegree;
  private final Edge[] mEdges;
  private final Edge[] mFirstEdge;
  private final Numbering mNumbering;
  private final Marks mVertexMarks;

  Min5ExtensionFinder(final Plantri plantri, final Numbering numbering, final Marks vertexMarks) {
    mPlantri = plantri;
    mState = plantri.getState();
    mDegree = mState.mDegree;
    mEdges = mState.mEdges;
    mFirstEdge = mState.mFirstEdge;
    mNumbering = numbering;
    mVertexMarks = vertexMarks;
  }

  /* Determine the inequivalent places to make extensions, for the
     ordinary triangulations of minimum degree 5.  The results are
     put in the arrays extD1[0..*nextD-1], etc..
     nbTot and nbOp are the usual group parameters.
     If lastA != null, this graph was made with an A-operation and lastA
     is its central edge.  If lastA == null, it wasn't made with A.
  */
  void findExtensions(final int nbTot, final int nbOp, final Edge[] extA1, final Edge[] extA2,
                      final MutableInteger nextA, final Edge[] extB, final boolean[] extBmirror, final MutableInteger nextB,
                      final Edge[] extC, final MutableInteger nextC, final Edge lastA) {
    int v1 = 0;
    int v2 = 0;
    int d1 = 0;
    int d2 = 0;

    mVertexMarks.resetMarksVertex();
    if (lastA != null) {
      v1 = lastA.mStart;
      v2 = lastA.mEnd;
      d1 = mDegree[v1];
      d2 = mDegree[v2];
      mVertexMarks.markVertex(v1);
      mVertexMarks.markVertex(v2);
      mVertexMarks.markVertex(lastA.mPrev.mEnd);
      mVertexMarks.markVertex(lastA.mNext.mEnd);
    }

    if (nbTot == 1) {
      // A-extensions, trivial group
      aExtensionTrivial(extA1, extA2, nextA, lastA, v1, v2, d1, d2);
      // B-extensions, trivial group
      bExtensionTrivial(extB, extBmirror, nextB, lastA);
      // C-extensions, trivial group
      cExtensionTrivial(extC, nextC);
    } else {
      final int nbOplim = nbOp == 0 ? nbTot : nbOp;
      mNumbering.resetToIdentity(mState.mNumEdges);
      // A-extensions, non-trivial group
      aExtensionNontrivial(nbTot, extA1, extA2, nextA, lastA, d1, d2);
      // B-extensions, non-trivial group
      bExtensionNontrivial(nbTot, extB, extBmirror, nextB, lastA, nbOplim);
      // C-extensions, non-trivial group
      cExtensionNontrivial(nbTot, extC, nextC);
    }
  }

  private int getNb1(final int nbTot, final Edge e1, final Edge e2) {
    int nb1 = 1;
    for (; nb1 < nbTot; ++nb1) {
      if (mNumbering.get(nb1, e1.mIndex).mAlloc < mNumbering.get(nb1, e2.mIndex).mAlloc) {
        if (mNumbering.get(nb1, e1.mIndex).mAlloc < e1.mAlloc || (mNumbering.get(nb1, e1.mIndex) == e1 && mNumbering.get(nb1, e2.mIndex).mAlloc < e2.mAlloc)) {
          break;
        }
      } else {
        if (mNumbering.get(nb1, e2.mIndex).mAlloc < e1.mAlloc || (mNumbering.get(nb1, e2.mIndex) == e1 && mNumbering.get(nb1, e1.mIndex).mAlloc < e2.mAlloc)) {
          break;
        }
      }
    }
    return nb1;
  }

  private void aExtensionNontrivial(final int nbTot, final Edge[] extA1, final Edge[] extA2, final MutableInteger nextA, final Edge lastA, final int d1, final int d2) {
    int k = 0;
    for (int i = 0; i < mState.mNumVertices; ++i) {
      if (mDegree[i] >= 6) {
        if (lastA != null && mDegree[i] + 4 < d1 + d2 && !mVertexMarks.isMarkedVertex(i)) {
          continue;
        }
        final Edge elast1 = mFirstEdge[i];
        Edge e1 = elast1;
        do {
          Edge e2 = e1.mNext.mNext.mNext;
          final Edge elast2 = e1.mPrev.mPrev;
          do {
            if (e1.mAlloc < e2.mAlloc) {
              final int nb1 = getNb1(nbTot, e1, e2);
              if (nb1 >= nbTot) {
                extA1[k] = e1;
                extA2[k++] = e2;
              }
            }
            e2 = e2.mNext;
          } while (e2 != elast2);
          e1 = e1.mNext;
        } while (e1 != elast1);
      }
    }
    nextA.set(k);
  }

  private void bExtensionNontrivial(final int nbTot, final Edge[] extB, final boolean[] extBmirror, final MutableInteger nextB, final Edge lastA, final int nbOplim) {
    if (lastA != null || mState.mNumVertices >= mPlantri.mMaxNV - 1) {
      nextB.set(0);
    } else {
      final EdgeFactory ef = mPlantri.mEdgeFactory;
      int k = 0;
      ef.resetMarks(mEdges);

      for (int i = 0; i < mState.mNumEdges; ++i) {
        if (!ef.isMarkedLo(mNumbering.get(0, i)) && mDegree[mNumbering.get(0, i).mStart] == 5 && mDegree[mNumbering.get(0, i).mEnd] == 5) {
          extB[k] = mNumbering.get(0, i).mMin;
          if (mNumbering.get(0, i) == mNumbering.get(0, i).mMin) {
            extBmirror[k] = true;
            mNumbering.minInverseMarkLo(mNumbering.minMarkLo(0, nbOplim, i), nbTot, i);
          } else {
            extBmirror[k] = false;
            mNumbering.minMarkLo(mNumbering.minInverseMarkLo(0, nbOplim, i), nbTot, i);
          }
          ++k;
        }
      }
      nextB.set(k);
    }
  }

  private void cExtensionNontrivial(final int nbTot, final Edge[] extC, final MutableInteger nextC) {
    if (mState.mNumVertices >= mPlantri.mMaxNV - 4) {
      nextC.set(0);
    } else {
      int k = 0;
      mVertexMarks.resetMarksVertex();
      for (int i = 0; i < mState.mNumVertices; ++i) {
        if (!mVertexMarks.isMarkedVertex(i) && mDegree[i] == 5) {
          extC[k++] = mFirstEdge[i];
          for (int nb = 0; nb < nbTot; ++nb) {
            mVertexMarks.markVertex(mNumbering.get(nb, mFirstEdge[i].mIndex).mStart);
          }
        }
      }
      nextC.set(k);
    }
  }

  private void cExtensionTrivial(final Edge[] extC, final MutableInteger nextC) {
    if (mState.mNumVertices >= mPlantri.mMaxNV - 4) {
      nextC.set(0);
    } else {
      int k = 0;
      for (int i = 0; i < mState.mNumVertices; ++i) {
        if (mDegree[i] == 5) {
          extC[k++] = mFirstEdge[i];
        }
      }
      nextC.set(k);
    }
  }

  private void aExtensionTrivial(final Edge[] extA1, final Edge[] extA2, final MutableInteger nextA, final Edge lastA, final int v1, final int v2, final int d1, final int d2) {
    int k = 0;
    for (int i = 0; i < mState.mNumVertices; ++i) {
      if (mDegree[i] >= 6) {
        final int cola = mDegree[i] + 4;

        if (lastA == null || cola >= d1 + d2 + 2 || mVertexMarks.isMarkedVertex(i)) {
          final Edge elast1 = mFirstEdge[i];
          Edge e1 = elast1;
          do {
            Edge e2 = e1.mNext.mNext.mNext;
            final Edge elast2 = e1.mPrev.mPrev;
            do {
              if (e2.mAlloc > e1.mAlloc) {
                extA1[k] = e1;
                extA2[k++] = e2;
              }
              e2 = e2.mNext;
            } while (e2 != elast2);
            e1 = e1.mNext;
          } while (e1 != elast1);
        } else if (cola >= d1 + d2) {
          final Edge elast1 = mFirstEdge[i];
          Edge e1 = elast1;
          do {
            Edge e2 = e1.mNext.mNext.mNext;
            final Edge elast2 = e1.mPrev.mPrev;
            int alpha = 2;
            do {
              if (e2.mAlloc > e1.mAlloc) {
                final int xd1 = e1.mEnd == v1 || e2.mEnd == v1 ? d1 + 1 : d1;
                final int xd2 = e1.mEnd == v2 || e2.mEnd == v2 ? d2 + 1 : d2;
                final int oldcola = xd1 + xd2;
                if (cola > oldcola) {
                  extA1[k] = e1;
                  extA2[k++] = e2;
                } else if (cola == oldcola) {
                  final int oldcolb = Math.min(xd1, xd2);
                  final int colb = 3 + Math.min(alpha, mDegree[i] - alpha - 2);
                  if (colb >= oldcolb) {
                    extA1[k] = e1;
                    extA2[k++] = e2;
                  }
                }
              }
              ++alpha;
              e2 = e2.mNext;
            } while (e2 != elast2);
            e1 = e1.mNext;
          } while (e1 != elast1);
        }
      }
    }
    nextA.set(k);
  }

  private void bExtensionTrivial(final Edge[] extB, final boolean[] extBmirror, final MutableInteger nextB, final Edge lastA) {
    if (lastA != null || mState.mNumVertices >= mPlantri.mMaxNV - 1) {
      nextB.set(0);
    } else {
      int k = 0;
      for (int i = 0; i < mState.mNumVertices; ++i) {
        if (mDegree[i] == 5) {
          final Edge eLast = mFirstEdge[i];
          Edge e = eLast;
          do {
            if (mDegree[e.mEnd] == 5 && e == e.mMin) {
              extB[k] = extB[k + 1] = e;
              extBmirror[k] = false;
              extBmirror[k + 1] = true;
              k += 2;
            }
            e = e.mNext;
          } while (e != eLast);
        }
      }
      nextB.set(k);
    }
  }
}
