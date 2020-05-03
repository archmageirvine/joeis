package irvine.oeis.a031;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;

/**
 * A031398 Squarefree n with no <code>4k+3</code> factors such that Pell equation <code>x^2 - n y^2 = -1</code> is insoluble.
 * @author Sean A. Irvine
 */
public class A031398 extends A031399 {

  @Override
  public Z next() {
    while (true) {
      final Z a = super.next();
      if (Cheetah.factor(a).isSquareFree()) {
        return a;
      }
    }
  }
}
