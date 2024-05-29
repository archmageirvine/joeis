package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A069953 Composite n such that (n-1)*phi(n) is a perfect square.
 * @author Sean A. Irvine
 */
public class A069953 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      if (Predicates.SQUARE.is(Functions.PHI.z(c).multiply(c.subtract(1)))) {
        return c;
      }
    }
  }
}
