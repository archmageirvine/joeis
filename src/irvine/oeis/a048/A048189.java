package irvine.oeis.a048;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.a005.A005114;

/**
 * A048189 Let (u1,u2) be successive untouchable numbers such that phi(u1) = phi(u2); sequence gives values of u1.
 * @author Sean A. Irvine
 */
public class A048189 extends A005114 {

  private Z mA = super.next();
  private Z mPhi = Euler.phi(mA);

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      final Z u = mPhi;
      mA = super.next();
      mPhi = Euler.phi(mA);
      if (u.equals(mPhi)) {
        return t;
      }
    }
  }
}
