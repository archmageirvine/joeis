package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.a005.A005117;

/**
 * A066653 Squarefree numbers k such that the pair 2*k +- 1 is a twin prime pair.
 * @author Sean A. Irvine
 */
public class A066653 extends A005117 {

  @Override
  public Z next() {
    while (true) {
      final Z s = super.next();
      final Z t = s.multiply2();
      if (t.add(1).isProbablePrime() && t.subtract(1).isProbablePrime()) {
        return s;
      }
    }
  }
}
