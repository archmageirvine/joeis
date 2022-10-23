package irvine.oeis.a048;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A048055 Numbers n such that (sum of the nonprime proper divisors of n) - (sum of prime divisors of n) = n.
 * @author Sean A. Irvine
 */
public class A048055 extends Sequence1 {

  private Z mN = Z.valueOf(531);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final FactorSequence fs = Jaguar.factor(mN);
      Z t = fs.sigma();
      for (final Z p : fs.toZArray()) {
        t = t.subtract(p.multiply2());
      }
      if (t.equals(mN.multiply2())) {
        return mN;
      }
    }
  }
}
