package irvine.oeis.a038;

import irvine.math.LongUtils;
import irvine.math.z.Z;

/**
 * A038570 Second derivative of n.
 * @author Sean A. Irvine
 */
public class A038570 extends A038554 {

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
