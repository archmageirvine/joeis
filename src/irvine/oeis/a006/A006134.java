package irvine.oeis.a006;
// manually 2026-08-09/lambdan at 2026-08-09 16:13

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A006134 a(n) = Sum_{k=0..n} binomial(2*k,k).
 * @author Georg Fischer
 */
public class A006134 extends AbstractSequence implements DirectSequence {

  private long mN = -1;
  private Z mA = Z.ONE;
  private Z mB = Z.THREE;

  /** Construct the sequence. */
  public A006134() {
    super(0);
  }

  @Override
  public Z next() {
    if (++mN > 1) {
      final Z t = mB.multiply(5 * mN - 2).subtract(mA.multiply(4 * mN - 2)).divide(mN);
      mA = mB;
      mB = t;
    } else if (mN == 0) {
      return mA;
    }
    return mB;
  }

  @Override
  public Z a(final Z n) {
    return a(n.longValueExact());
  }

  @Override
  public Z a(final long n) {
    return Integers.SINGLETON.sum(0, n, k -> Binomial.binomial(2 * k, k));
  }
}
