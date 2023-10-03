package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066176 Numbers k such that sigma(k+1) - sigma(k) = sigma(k)/d(k), where d(k) denotes the number of divisors of k.
 * @author Sean A. Irvine
 */
public class A066176 extends Sequence1 {

  private long mN = 134;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final Z s = fs.sigma();
      if (Jaguar.factor(mN + 1).sigma().subtract(s).multiply(fs.sigma0()).equals(s)) {
        return Z.valueOf(mN);
      }
    }
  }
}
