package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A087556 a(n) = smallest prime that is the concatenation of two numbers whose sum is n.
 * @author Sean A. Irvine
 */
public class A087556 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    if (++mN % 3 == 0) {
      return Z.ZERO;
    }
    Z min = null;
    for (long k = 1; k < mN; ++k) {
      final Z v = new Z(String.valueOf(k) + (mN - k));
      if ((min == null || v.compareTo(min) < 0) && v.isProbablePrime()) {
        min = v;
      }
    }
    return min == null ? Z.ZERO : min;
  }
}
