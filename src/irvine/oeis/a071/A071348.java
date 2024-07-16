package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a068.A068019;

/**
 * A071348 Intersection of A068017 and A068019: numbers n such that both sigma(n) and phi(n) are middle terms between (different) twin prime pairs.
 * @author Sean A. Irvine
 */
public class A071348 extends A068019 {

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      final Z t = Functions.SIGMA1.z(c);
      if (t.subtract(1).isProbablePrime() && t.add(1).isProbablePrime()) {
        return c;
      }
    }
  }
}
