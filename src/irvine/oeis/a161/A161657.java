package irvine.oeis.a161;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A161657 a(n) = the smallest multiple of {the sum of the distinct prime divisors of n} that is &gt;=n.
 * @author Sean A. Irvine
 */
public class A161657 implements Sequence {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    final FactorSequence fs = Cheetah.factor(mN);
    Z sum = Z.ZERO;
    for (final Z p : fs.toZArray()) {
      sum = sum.add(p);
    }
    return sum.multiply(mN.add(sum).subtract(Z.ONE).divide(sum));
  }
}

