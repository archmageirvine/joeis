package irvine.oeis.a392;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392201 Positive k such that the quadratic Diophantine equation x^2 + y^2 + z^2 = k * (x*y - x*z + y*z) has nontrivial integer solutions.
 * @author Sean A. Irvine
 */
public class A392201 extends Sequence1 {

  private long mN = 1;

  private boolean is(final long n) {
    final FactorSequence fs = Jaguar.factor(Z.valueOf(n - 2).multiply(n + 1));
    for (final Z p : fs.toZArray()) {
      if ((fs.getExponent(p) & 1) == 1 && p.mod(3) == 2) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
