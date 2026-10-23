package irvine.oeis.a087;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087004 Numbers whose number of divisors equals the sum of their separate prime-power decompositions.
 * @author Sean A. Irvine
 */
public class A087004 extends Sequence1 {

  private long mN = 1;

  private Z sum(final long n) {
    final FactorSequence fs = Jaguar.factor(n);
    Z sum = Z.ZERO;
    for (final Z p : fs.toZArray()) {
      sum = sum.add(p.pow(fs.getExponent(p)));
    }
    return sum;
  }

  @Override
  public Z next() {
    while (true) {
      if (sum(++mN).equals(Functions.SIGMA0.z(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}

