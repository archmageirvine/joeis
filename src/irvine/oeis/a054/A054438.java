package irvine.oeis.a054;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.a038.A038570;

/**
 * A054438 Third derivative of n.
 * @author Sean A. Irvine
 */
public class A054438 extends A038570 {

  @Override
  public Z next() {
    final Z t = super.next();
    if (t.isZero()) {
      return Z.ZERO;
    }
    final long m = t.longValueExact();
    return Z.valueOf((m ^ (m >>> 1)) - (1L << LongUtils.log2(m)));
  }
}
