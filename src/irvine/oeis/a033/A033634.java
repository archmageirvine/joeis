package irvine.oeis.a033;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033634 OddPowerSigma(n) = sum of odd power divisors of n.
 * @author Sean A. Irvine
 */
public class A033634 implements Sequence {

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
    for (final Z d : Cheetah.factor(++mN).divisors()) {
      if (isOddPowers(Cheetah.factor(d))) {
        sum = sum.add(d);
      }
    }
    return sum;
  }
}

