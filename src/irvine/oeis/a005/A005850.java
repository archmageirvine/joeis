package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a002.A002315;

/**
 * A005850.
 * @author Sean A. Irvine
 */
public class A005850 extends A002315 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z v = super.next();
      final Z p = mN.multiply2().add(1);
      if (v.isProbablePrime() && p.isProbablePrime()) {
        return p;
      }
    }
  }
}
