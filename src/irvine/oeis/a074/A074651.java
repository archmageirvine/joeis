package irvine.oeis.a074;

import irvine.factor.factor.Cheetah;
import irvine.math.Mobius;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A074651 (1/n) * sum over d|n of {mu(n/d) * (3d)! / d!^3}.
 * @author Sean A. Irvine
 */
public class A074651 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = 0;

  protected int scale() {
    return 3;
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (final Z dd : Cheetah.factor(mN).divisors()) {
      final int d = dd.intValueExact();
      final int mobius = Mobius.mobius(mN / d);
      if (mobius != 0) {
        sum = sum.signedAdd(mobius > 0, mF.factorial(scale() * d).divide(mF.factorial(d).pow(scale())));
      }
    }
    return sum.divide(mN);
  }
}
