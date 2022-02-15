package irvine.oeis.a034;

import irvine.factor.factor.Cheetah;
import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034741 Dirichlet convolution of mu(n) with 3^(n-1).
 * @author Sean A. Irvine
 * @author Georg Fischer
 */
public class A034741 implements Sequence {

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
    for (final Z dd : Cheetah.factor(mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(mBase.pow(d - 1).multiply(Mobius.mobius(mN / d)));
    }
    return sum;
  }
}
