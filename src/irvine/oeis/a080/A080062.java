package irvine.oeis.a080;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A080062 Composite numbers n such that for all primes p dividing n, p-1 divides n-1.
 * @author Sean A. Irvine
 */
public class A080062 extends A002808 {

  private boolean is(final Z n) {
    final Z n1 = n.subtract(1);
    for (final Z p : Jaguar.factor(n).toZArray()) {
      if (!n1.mod(p.subtract(1)).isZero()) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      if (is(c)) {
        return c;
      }
    }
  }
}
