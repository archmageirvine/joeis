package irvine.oeis.a002;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A002426 Central trinomial coefficients: largest coefficient of (1 + x + x^2)^n.
 * @author Sean A. Irvine
 */
public class A002426 extends AbstractSequence implements DirectSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A002426(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A002426() {
    super(0);
  }

  protected long mN = -1;
  private Z mA = Z.ONE;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      final Z t = mB.multiply(2 * mN - 1).add(mA.multiply(3).multiply(mN - 1)).divide(mN);
      mA = mB;
      mB = t;
    }
    return mB;
  }

  @Override
  public Z a(final Z n) {
    return a(n.longValueExact());
  }

  @Override
  public Z a(final long n) {
    return Integers.SINGLETON.sum(0, n, k -> Binomial.binomial(n, k).multiply(Binomial.binomial(k, n - k)));
  }

}
