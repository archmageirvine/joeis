package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034741 Dirichlet convolution of mu(n) with 3^(n-1).
 * @author Sean A. Irvine
 * @author Georg Fischer
 */
public class A034741 extends Sequence1 {

  private int mN;
  private Z mBase;

  /** Construct the sequence. */
  public A034741() {
    this(3);
  }

  /**
   * Generic constructor with parameter
   * @param base
   */
  public A034741(final int base) {
    mBase = Z.valueOf(base);
    mN = 0;
  }

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    ++mN;
    for (final Z dd : Jaguar.factor(mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(mBase.pow(d - 1).multiply(Functions.MOBIUS.i((long) (mN / d))));
    }
    return sum;
  }
}
