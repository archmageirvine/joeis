package irvine.oeis.a023;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023890 Sum of nonprime divisors of n.
 * @author Sean A. Irvine
 */
public class A023890 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Cheetah.factor(++mN);
    Z sum = fs.sigma();
    for (final Z p : fs.toZArray()) {
      sum = sum.subtract(p);
    }
    return sum;
  }
}

