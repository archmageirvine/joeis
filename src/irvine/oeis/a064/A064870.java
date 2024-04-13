package irvine.oeis.a064;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A064870 The minimal number which has multiplicative persistence 6 in base n.
 * @author Sean A. Irvine
 */
public class A064870 extends AbstractSequence {

  private int mN = 6;

  /** Construct the sequence. */
  public A064870() {
    super(7);
  }

  static long multiplicativePersistence(long n, final int base, final int target) {
    long k = 0;
    while (n >= base) {
      n = Functions.DIGIT_PRODUCT.l(base, n);
      if (++k > target) {
        return k;
      }
    }
    return k;
  }

  @Override
  public Z next() {
    if (++mN > 719) {
      return Z.valueOf(7L * mN - mN / 720);
    } else {
      long m = 0;
      while (multiplicativePersistence(++m, mN, 6) != 6) {
        // do nothing
      }
      return Z.valueOf(m);
    }
  }
}

