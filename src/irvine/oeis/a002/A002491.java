package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002491.
 * @author Sean A. Irvine
 */
public class A002491 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    Z m = mN;
    mN = mN.add(1);
    Z a = mN;
    while (m.signum() > 0) {
      final Z t = m.subtract(1);
      a = a.add(t).divide(m).multiply(m);
      m = t;
    }
    return a;
  }
}
