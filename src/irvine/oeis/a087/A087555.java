package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A087555 a(n) = largest prime that is the concatenation of two numbers whose sum is n.
 * @author Sean A. Irvine
 */
public class A087555 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    if (++mN % 3 == 0) {
      return Z.ZERO;
    }
    Z max = Z.ZERO;
    for (long k = 1; k < mN; ++k) {
      final Z v = new Z(String.valueOf(k) + (mN - k));
      if (v.compareTo(max) > 0 && v.isProbablePrime()) {
        max = v;
      }
    }
    return max;
  }
}
