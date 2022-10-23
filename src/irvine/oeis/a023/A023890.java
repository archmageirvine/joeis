package irvine.oeis.a023;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A023890 Sum of the nonprime divisors of n.
 * @author Sean A. Irvine
 */
public class A023890 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z sum = fs.sigma();
    for (final Z p : fs.toZArray()) {
      sum = sum.subtract(p);
    }
    return sum;
  }
}

