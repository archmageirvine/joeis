package irvine.oeis.a031;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a003.A003814;

/**
 * A031397 Nonsquarefree n such that Pell equation x^2 - n y^2 = -1 is soluble.
 * @author Sean A. Irvine
 */
public class A031397 extends A003814 {

  @Override
  public Z next() {
    while (true) {
      final Z a = super.next();
      if (!Cheetah.factor(a).isSquareFree()) {
        return a;
      }
    }
  }
}
