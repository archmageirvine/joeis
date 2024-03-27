package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068999 Numbers k such that k = (sum of distinct prime factors of k)*(product of distinct prime factors of k).
 * @author Sean A. Irvine
 */
public class A068999 extends Sequence1 {

  private Z mN = Z.THREE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final FactorSequence fs = Jaguar.factor(mN);
      Z sum = Z.ZERO;
      Z prod = Z.ONE;
      for (final Z p : fs.toZArray()) {
        sum = sum.add(p);
        prod = prod.multiply(p);
      }
      if (sum.multiply(prod).equals(mN)) {
        return mN;
      }
    }
  }
}
