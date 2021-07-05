package irvine.math.lattice;

/**
 * The <code>Z^n</code> lattice.
 * @author Sean A. Irvine
 */
class ZnLattice extends AbstractLattice {

  // n-dimensional lattice
  // Neighbours change one coordinate by +/- 1.
  private final int mBitsPerCoordinate;
  private final long mMask;
  private final long mBias;
  private final long mOrigin;
  private final long[] mDeltas;

  private final int mDimension;

  /**
   * Construct n-dimensional lattice.
   * @param n dimension
   */
  public ZnLattice(final int n) {
    if (n > 30) {
      throw new UnsupportedOperationException();
    }
    mDimension = n;
    mBitsPerCoordinate = Long.SIZE / n;
    mMask = (1L << mBitsPerCoordinate) - 1;
    mBias = 1L << (mBitsPerCoordinate - 1);
    mDeltas = new long[2 * mDimension];
    mOrigin = toPoint(new long[mDimension]);
    long t = 1;
    for (int k = 0; k < mDeltas.length; k += 2, t <<= mBitsPerCoordinate) {
      mDeltas[k] = t;
      mDeltas[k + 1] = -t;
    }
  }

  @Override
  public int neighbourCount(final long point) {
    return mDeltas.length;
  }

  @Override
  public int dimension() {
    return mDimension;
  }

  @Override
  public long origin() {
    return mOrigin;
  }

  @Override
  public long ordinate(final long point, final int ordinate) {
    assert ordinate >= 0 && ordinate < mDimension;
    return (point >> (ordinate * mBitsPerCoordinate) & mMask) - mBias;
  }

  @Override
  public long toPoint(final long... coordinates) {
    long p = 0;
    for (final long c : coordinates) {
      p <<= mBitsPerCoordinate;
      p += mBias + c;
    }
    return p;
  }

  @Override
  public long neighbour(final long point, final int neighbourNumber) {
    return point + mDeltas[neighbourNumber];
  }

  @Override
  public long distanceBound(final long point) {
    long d = 0;
    for (int k = 0; k < dimension(); ++k) {
      d += Math.abs(ordinate(point, k));
    }
    return d;
  }
}
