package irvine.oeis.a392;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A392072 Smallest integer k such that 1 + x^2 + y^2 = k*prime(n) has at least one solution for some integers x, y.
 * @author Sean A. Irvine
 */
public class A392072 extends A000040 {

  // After Robert Israel

  private boolean ss(final Z s) {
    final FactorSequence fs = Jaguar.factor(s);
    for (final Z p : fs.toZArray()) {
      if (p.mod(4) == 3 && (fs.getExponent(p) & 1) == 1) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    final Z p = super.next();
    long k = 0;
    while (true) {
      if (ss(p.multiply(++k).subtract(1))) {
        return Z.valueOf(k);
      }
    }
  }
}

