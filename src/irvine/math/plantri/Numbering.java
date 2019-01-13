package irvine.math.plantri;

/**
 * Hold a numbering.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
class Numbering {

  private final Edge[][] mNumbering;
  private final EdgeFactory mEdgeFactory;

  Numbering(final int edges, final EdgeFactory edgeFactory) {
    mEdgeFactory = edgeFactory;
    mNumbering = new Edge[2 * edges][edges];
    for (int k = 0; k < mNumbering.length; ++k) {
      mNumbering[k] = PlantriGraphState.initEdgeArray(edgeFactory, edges);
    }
  }

  int markLo(final int start, final int limit, final int offset) {
    int k = start;
    while (k < limit) {
      mEdgeFactory.markLo(mNumbering[k++][offset]);
    }
    return k;
  }

  int inverseMarkLo(final int start, final int limit, final int offset) {
    int k = start;
    while (k < limit) {
      mEdgeFactory.markLo(mNumbering[k++][offset].mInverse);
    }
    return k;
  }

  int inverseNextInverseMarkLo(final int start, final int limit, final int offset) {
    int k = start;
    while (k < limit) {
      mEdgeFactory.markLo(mNumbering[k++][offset].mInverse.mNext.mInverse);
    }
    return k;
  }

  int prevMarkLo(final int start, final int limit, final int offset) {
    int k = start;
    while (k < limit) {
      mEdgeFactory.markLo(mNumbering[k++][offset].mPrev);
    }
    return k;
  }

  int prevPrevMarkLo(final int start, final int limit, final int offset) {
    int k = start;
    while (k < limit) {
      mEdgeFactory.markLo(mNumbering[k++][offset].mPrev.mPrev);
    }
    return k;
  }

  int prevPrevPrevMarkLo(final int start, final int limit, final int offset) {
    int k = start;
    while (k < limit) {
      mEdgeFactory.markLo(mNumbering[k++][offset].mPrev.mPrev.mPrev);
    }
    return k;
  }

  int minMarkLo(final int start, final int limit, final int offset) {
    int k = start;
    while (k < limit) {
      mEdgeFactory.markLo(mNumbering[k++][offset].mMin);
    }
    return k;
  }

  int minInverseMarkLo(final int start, final int limit, final int offset) {
    int k = start;
    while (k < limit) {
      mEdgeFactory.markLo(mNumbering[k++][offset].mMin.mInverse);
    }
    return k;
  }

  void resetToIdentity(final int edges) {
    for (int i = 0; i < edges; ++i) {
      mNumbering[0][i].mIndex = i;
    }
  }

  Edge get(final int i, final int j) {
    return mNumbering[i][j];
  }

  Edge[] get(final int i) {
    return mNumbering[i];
  }

  void set(final int i, final int j, final Edge e) {
    mNumbering[i][j] = e;
  }

  private int findEdgeNumber() {
    int q;
    for (q = 0; !mNumbering[0][q].isValid5Edge(); ++q) {
    }
    return q;
  }

  int findEdgeNumber(final Edge e1, final Edge e2, final int nblim) {
    int nb;
    for (nb = 0; nb < nblim; ++nb) {
      if (mNumbering[nb][0] == e1 || mNumbering[nb][0] == e2) {
        break;
      }
    }
    return nb;
  }

  int findEdgeNumber(final Edge e1, final int nblim) {
    final int q = findEdgeNumber();
    int nb;
    for (nb = 0; nb < nblim; ++nb) {
      if (mNumbering[nb][q] == e1) {
        break;
      }
    }
    return nb;
  }
}
