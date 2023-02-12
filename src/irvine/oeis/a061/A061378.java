package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.Permutation;

/**
 * A061378 Product of all numbers formed by permuting the digits of n.
 * @author Sean A. Irvine
 */
public class A061378 extends Sequence0 {

  // Slightly complicated because repeated arrangements must be counted multiple times
  // a(11) = 121 = 11 * 11

  private long mN = -1;
  private long mLimit = 10;
  private int mDigits = 1;

  @Override
  public Z next() {
    if (++mN == mLimit) {
      ++mDigits;
      mLimit *= 10;
    }
    final int[] d = new int[mDigits];
    long m = mN;
    for (int k = 0; k < d.length; ++k) {
      d[k] = (int) (m % 10);
      m /= 10;
    }
    Z prod = Z.ONE;
    final Permutation perm = new Permutation(mDigits);
    int[] p;
    while ((p = perm.next()) != null) {
      long v = 0;
      for (final int k : p) {
        v *= 10;
        v += d[k];
      }
      prod = prod.multiply(v);
    }
    return prod;
  }
}

