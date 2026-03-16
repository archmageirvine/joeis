package irvine.oeis.a001;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A001353 a(n) = 4*a(n-1) - a(n-2) with a(0) = 0, a(1) = 1.
 * @author Sean A. Irvine
 */
public class A001353 extends Sequence0 implements DirectSequence {

  private Z mA = Z.valueOf(-4);
  private Z mB = Z.NEG_ONE;

  @Override
  public Z next() {
    final Z t = mB.shiftLeft(2).subtract(mA);
    mA = mB;
    mB = t;
    return t;
  }

  @Override
  public Z a(final Z n) {
    return a(n.longValueExact());
  }

  @Override
  public Z a(final long n) {
    // a(n) = Sum_{k=0..n-1} binomial(n+k,2*k+1)*2^k.
    return Integers.SINGLETON.sum(0, n - 1, k -> Binomial.binomial(n + k, 2 * k + 1).multiply(Z.ONE.shiftLeft(k)));
  }

}
