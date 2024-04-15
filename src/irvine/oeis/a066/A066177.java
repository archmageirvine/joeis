package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066177 Numbers n such that sigma(n+1)-sigma(n) = -sigma(n)/d(n), where d(n) denotes the number of divisors of n.
 * @author Sean A. Irvine
 */
public class A066177 extends Sequence1 {

  private long mN = 164;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final Z s = fs.sigma();
      if (s.subtract(Functions.SIGMA.z(mN + 1)).multiply(fs.sigma0()).equals(s)) {
        return Z.valueOf(mN);
      }
    }
  }
}
