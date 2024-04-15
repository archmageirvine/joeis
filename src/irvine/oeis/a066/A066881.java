package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066881 Numbers n such that sigma(phi(n))/sigma(n) is an integer &gt;= 4.
 * @author Sean A. Irvine
 */
public class A066881 extends Sequence1 {

  private long mN = 121678;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final Z s = Functions.SIGMA.z(fs.phi());
      final Z t = fs.sigma();
      if (s.mod(t).isZero()) {
        final Z u = s.divide(t);
        if (u.compareTo(Z.FOUR) >= 0) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
