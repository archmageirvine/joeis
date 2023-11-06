package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A034448 usigma(n) = sum of unitary divisors of n (divisors d such that gcd(d, n/d)=1); also called UnitarySigma(n).
 * @author Sean A. Irvine
 */
public class A034448 extends Sequence1 implements DirectSequence {

  private Z mN = Z.ZERO;

  @Override
  public Z a(final Z n) {
    return Jaguar.factor(n).unitarySigma();
  }

  @Override
  public Z a(int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    return a(mN);
  }
}

