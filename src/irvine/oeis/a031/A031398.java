package irvine.oeis.a031;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;

/**
 * A031398 Squarefree n with no 4k+3 factors such that Pell equation x^2 - n y^2 = -1 is insoluble.
 * @author Sean A. Irvine
 */
public class A031398 extends A031399 {

  @Override
  public Z next() {
    while (true) {
      final Z a = super.next();
      if (Jaguar.factor(a).isSquareFree()) {
        return a;
      }
    }
  }
}
