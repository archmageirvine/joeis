package irvine.oeis.a048;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a005.A005114;

/**
 * A048190 Let (u1,u2) be successive untouchable numbers such that phi(u1) = phi(u2); sequence gives values of u2.
 * @author Sean A. Irvine
 */
public class A048190 extends A005114 {

  private Z mPhi = Functions.PHI.z(super.next());

  {
    mPhi = Functions.PHI.z(super.next());
  }

  @Override
  public Z next() {
    while (true) {
      final Z u = mPhi;
      final Z t = super.next();
      mPhi = Functions.PHI.z(t);
      if (u.equals(mPhi)) {
        return t;
      }
    }
  }
}
