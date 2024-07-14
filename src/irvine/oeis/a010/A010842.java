package irvine.oeis.a010;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A010842 Expansion of e.g.f.: exp(2*x)/(1-x).
 * @author Sean A. Irvine
 */
public class A010842 extends Sequence0 implements DirectSequence {

  private int mN = -1;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(mN).add(Z.ONE.shiftLeft(mN));
    }
    return mA;
  }

  @Override
  public Z a(final Z n) {
    return a(n.intValueExact());
  }

  @Override
  public Z a(final int n) {
    // a(n) = Sum_{k=0..n} k!*binomial(n, k)*2^(n-k)
    return Integers.SINGLETON.sum(0, n, k -> Functions.FACTORIAL.z(k).multiply(Binomial.binomial(n, k)).multiply(Z.TWO.pow(n - k)));
  }

}
