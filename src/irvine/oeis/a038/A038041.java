package irvine.oeis.a038;

import irvine.factor.factor.Cheetah;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038041.
 * @author Sean A. Irvine
 */
public class A038041 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Cheetah.factor(++mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(mF.factorial(mN).divide(mF.factorial(d)).divide(mF.factorial(mN / d).pow(d)));
    }
    return sum;
  }
}
