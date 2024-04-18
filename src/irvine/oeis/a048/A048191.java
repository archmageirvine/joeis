package irvine.oeis.a048;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a005.A005114;

/**
 * A048191 Let (u1,u2) be successive untouchable numbers such that phi(u1) = phi(u2) = k; sequence gives values of k.
 * @author Sean A. Irvine
 */
public class A048191 extends A005114 {

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
        return mPhi;
      }
    }
  }
}
