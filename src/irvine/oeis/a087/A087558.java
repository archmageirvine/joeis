package irvine.oeis.a087;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087558 a(n) = largest prime that is the concatenation of two numbers whose product is n.
 * @author Sean A. Irvine
 */
public class A087558 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN % 3 == 2) {
      return Z.ZERO;
    }
    Z max = Z.ZERO;
    for (final Z d : Jaguar.factor(mN).divisors()) {
      final Z v = new Z(d.toString() + mN / d.longValue());
      if (v.compareTo(max) > 0 && v.isProbablePrime()) {
        max = v;
      }
    }
    return max;
  }
}
