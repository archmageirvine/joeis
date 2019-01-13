package irvine.math.plantri;

import irvine.math.MutableInteger;

/**
 * Find extensions.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
public class QuadrangulationMin3ExtensionFinder {

  private final Plantri mPlantri;
  private final PlantriGraphState mState;
  private final int[] mDegree;
  private final Edge[] mEdges;
  private final Edge[] mFirstEdge;
  private final Numbering mNumbering;
  private final Marks mVertexMarks;

  QuadrangulationMin3ExtensionFinder(final Plantri plantri, final Numbering numbering, final Marks vertexMarks) {
    mPlantri = plantri;
    mState = plantri.getState();
    mDegree = mState.mDegree;
    mEdges = mState.mEdges;
    mFirstEdge = mState.mFirstEdge;
    mNumbering = numbering;
    mVertexMarks = vertexMarks;
  }

  /* Determine the inequivalent places to make extensions, for the
     quadrangulations with minDeg 3.  The results are put in the arrays
     extP1[0..*nextP1-1], etc..
     nbTot and nbOp are the usual group parameters.
     If lastA != null, this graph was made with an P1-operation and lastP1
     is its reference edge.  If lastP1 == null, it wasn't made with P1.
  */
  void findExtensions(final int nbTot, final int nbOp, final Edge[] extP1, final MutableInteger nextP1,
                      final Edge[] extP3, final MutableInteger nextP3, final Edge lastP1) {
    final EdgeFactory ef = mPlantri.mEdgeFactory;
    if (nbTot == 1) {
      // P1 extension for trivial group
      final int maxdeg;
      final int vx;
      mVertexMarks.resetMarksVertex();
      if (lastP1 != null) {
        maxdeg = mDegree[lastP1.mEnd];
        mVertexMarks.markVertex(lastP1.mStart);
        mVertexMarks.markVertex(lastP1.mNext.mInverse.mPrev.mEnd);
        vx = lastP1.mEnd;
      } else {
        vx = -1;
        maxdeg = 0;
      }

      int k = 0;
      for (int i = 0; i < mState.mNumVertices; ++i) {
        if (mDegree[i] >= 4) {
          final Edge eLast = mFirstEdge[i];
          Edge e = eLast;
          if (i == vx) {
            do {
              extP1[k++] = e;
              e = e.mNext;
            } while (e != eLast);
          } else {
            do {
              if (mVertexMarks.isMarkedVertex(e.mPrev.mEnd) || mVertexMarks.isMarkedVertex(e.mNext.mEnd) || mDegree[e.mEnd] >= maxdeg) {
                extP1[k++] = e;
              }
              e = e.mNext;
            } while (e != eLast);
          }
        }
      }
      nextP1.set(k);

      // P3 extension for trivial group
      if (mState.mNumVertices <= mPlantri.mMaxNV - 4) {
        k = 0;
        ef.resetMarks(mEdges);

        for (int i = 0; i < mState.mNumVertices; ++i) {
          final Edge eLast = mFirstEdge[i];
          Edge e = eLast;
          do {
            if (!ef.isMarkedLo(e)) {
              extP3[k++] = e;
              ef.markLo(e);
              Edge ee = e.mInverse.mPrev;
              ef.markLo(ee);
              ee = ee.mInverse.mPrev;
              ef.markLo(ee);
              ee = ee.mInverse.mPrev;
              ef.markLo(ee);
            }
            e = e.mNext;
          } while (e != eLast);
        }
        nextP3.set(k);
      } else {
        nextP3.set(0);
      }
    } else {
      final int nbOplim = nbOp == 0 ? nbTot : nbOp;
      mNumbering.resetToIdentity(mState.mNumEdges);

      // P1 extensions for non-trivial group
      int k = 0;
      ef.resetMarks(mEdges);

      for (int i = 0; i < mState.mNumVertices; ++i) {
        if (mDegree[i] >= 4) {
          final Edge eLast = mFirstEdge[i];
          Edge e = eLast;
          do {
            if (!ef.isMarkedLo(e)) {
              extP1[k++] = e;
              mNumbering.markLo(1, nbTot, e.mIndex);
            }
            e = e.mNext;
          } while (e != eLast);
        }
      }
      nextP1.set(k);

      // P3 extensions for non-trivial group
      if (mState.mNumVertices <= mPlantri.mMaxNV - 4) {
        ef.resetMarks(mEdges);
        k = 0;
        for (int i = 0; i < mState.mNumVertices; ++i) {
          final Edge eLast = mFirstEdge[i];
          Edge e = eLast;
          do {
            if (!ef.isMarkedLo(e)) {
              extP3[k++] = e;
              Edge ee = e;
              do {
                mNumbering.inverseMarkLo(mNumbering.markLo(0, nbOplim, ee.mIndex), nbTot, ee.mIndex);
                ee = ee.mInverse.mPrev;
              } while (ee != e);
            }
            e = e.mNext;
          } while (e != eLast);
        }
        nextP3.set(k);
      } else {
        nextP3.set(0);
      }
    }
  }

}
