package irvine.oeis.a086;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086484 Let k be the largest number such that n is a k-th power; then a(n) is the least positive number m such that m + n is a (k+1)st power.
 * @author Sean A. Irvine
 */
public class A086484 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    int k = 0;
    for (final Z p : fs.toZArray()) {
      k = Functions.GCD.i(k, fs.getExponent(p));
    }
    return Z.valueOf(mN).root(k + 1).add(1).pow(k + 1).subtract(mN);
  }
}

