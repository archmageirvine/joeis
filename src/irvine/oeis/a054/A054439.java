package irvine.oeis.a054;

import irvine.math.LongUtils;
import irvine.math.z.Z;

/**
 * A054439 Fourth derivative of n.
 * @author Sean A. Irvine
 */
public class A054439 extends A054438 {

  @Override
  public Z next() {
    final Z t = super.next();
    if (t.isZero()) {
      return Z.ZERO;
    }
    final long m = t.longValueExact();
    return Z.valueOf((m ^ (m >>> 1)) - (1L << LongUtils.lg(m)));
  }
}
