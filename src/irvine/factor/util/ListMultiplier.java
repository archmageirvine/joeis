package irvine.factor.util;

import irvine.math.z.Z;

/**
 * Methods to support the computation of products involving a large
 * number of values.
 *
 * @author Sean A. Irvine
 */
public class ListMultiplier {

  /** Size threshold used in collecting terms. */
  private static final int SIZE_THRESHOLD = Z.BASE_BITS * 3;
  /** Stepping size for array. */
  private static final int ALLOC_SIZE = 100;

  private Z[] mParts = new Z[ALLOC_SIZE];

  /** Default constructor. */
  public ListMultiplier() {
  }

  /**
   * Include the given value in the pending product.
   *
   * @param value value of add
   */
  public void add(final long value) {
    if (mParts[0] == null) {
      mParts[0] = Z.valueOf(value);
      return;
    }
    final Z r = mParts[0].multiply(value);
    mParts[0] = r;
    if (r.bitLength() <= SIZE_THRESHOLD) {
      return;
    }
    for (int k = 1; k < mParts.length; ++k) {
      if (mParts[k] == null) {
        mParts[k] = mParts[k - 1];
        mParts[k - 1] = null;
        return;
      } else {
        mParts[k] = mParts[k].multiply(mParts[k - 1]);
        mParts[k - 1] = null;
      }
    }
    // need more space
    final int i = mParts.length;
    final Z[] newParts = new Z[i + ALLOC_SIZE];
    System.arraycopy(mParts, 0, newParts, 0, i);
    mParts = newParts;
    mParts[i] = mParts[i - 1];
    mParts[i - 1] = null;
  }

  /**
   * Compute the product of all pending values.
   *
   * @return product of pending values
   */
  public Z product() {
    Z r = Z.ONE;
    for (final Z p : mParts) {
      if (p != null) {
        r = r.multiply(p);
      }
    }
    return r;
  }

}
