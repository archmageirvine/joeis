package irvine.math.plantri;

/**
 * Find extensions.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
public class QuadrangulationNf4ExtensionFinder {

  private final PlantriGraphState mState;
  private final int[] mDegree;
  private final Edge[] mEdges;
  private final Edge[] mFirstEdge;
  private final Numbering mNumbering;
  private final Marks mVertexMarks;
  private final EdgeFactory mEdgeFactory;

  QuadrangulationNf4ExtensionFinder(final PlantriGraphState state, final Numbering numbering, final Marks vertexMarks, final EdgeFactory edgeFactory) {
    mState = state;
    mDegree = state.mDegree;
    mEdges = state.mEdges;
    mFirstEdge = state.mFirstEdge;
    mNumbering = numbering;
    mVertexMarks = vertexMarks;
    mEdgeFactory = edgeFactory;
  }

  /* Determine the inequivalent places to make extensions, for the
     3-connected quadrangulations without non-facial 4-cycles.
     The results are put in the arrays extP1[0..*nextP1-1], etc..
     nbTot and nbOp are the usual group parameters.
     If lastA != null, this graph was made with an P1-operation and lastP1
     is its reference edge.  If lastP1 == null, it wasn't made with P1.
  */
  int findExtensions(final int nbTot, final Edge[] extP1, final Edge lastP1) {
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
      return k;
    } else {
      mNumbering.resetToIdentity(mState.mNumEdges);

      // P1 extensions for non-trivial group
      int k = 0;
      mEdgeFactory.resetMarks(mEdges);

      for (int i = 0; i < mState.mNumVertices; ++i) {
        if (mDegree[i] >= 4) {
          final Edge eLast = mFirstEdge[i];
          Edge e = eLast;
          do {
            if (!mEdgeFactory.isMarkedLo(e)) {
              extP1[k++] = e;
              mNumbering.markLo(1, nbTot, e.mIndex);
            }
            e = e.mNext;
          } while (e != eLast);
        }
      }
      return k;
    }
  }
}
