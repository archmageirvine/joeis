package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.a011.A011775;

/**
 * A047630 Numbers n such that n | Sigma(n) * Phi(n) and n not congruent to 0 (mod 6).
 * @author Sean A. Irvine
 */
public class A047630 extends A011775 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.mod(6) != 0) {
        return t;
      }
    }
  }
}
