package irvine.oeis.a033;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033634 OddPowerSigma(n) = sum of odd power divisors of n.
 * @author Sean A. Irvine
 */
public class A033634 extends Sequence1 {

  protected long mN = 0;

  private boolean isOddPowers(final FactorSequence fs) {
    for (final Z e : fs.toZArray()) {
      if ((fs.getExponent(e) & 1) == 0) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      if (isOddPowers(Jaguar.factor(d))) {
        sum = sum.add(d);
      }
    }
    return sum;
  }
}

