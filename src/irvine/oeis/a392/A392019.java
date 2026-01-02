package irvine.oeis.a392;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392019 allocated for Elijah Beregovsky.
 * @author Sean A. Irvine
 */
public class A392019 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z n2 = Z.valueOf(++mN).square();
    for (long k = 1; k <= mN / 2; ++k) {
      final FactorSequence fs = Jaguar.factor(Binomial.binomial(mN, k));
      Z u = Z.ONE;
      for (final Z p : fs.toZArray()) {
        if (p.compareTo(k) > 0) {
          break;
        }
        u = u.multiply(p.pow(fs.getExponent(p)));
        if (u.compareTo(n2) > 0) {
          return Z.valueOf(k);
        }
      }
    }
    return Z.ZERO;
  }
}
