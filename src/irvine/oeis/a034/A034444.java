package irvine.oeis.a034;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A034444 a(n) is the number of unitary divisors of n (d such that d divides n, gcd(d, n/d) = 1).
 * @author Sean A. Irvine
 */
public class A034444 extends Sequence1 implements DirectSequence {

  protected Z mN = Z.ZERO;

  @Override
  public Z a(final Z n) {
    return Functions.USIGMA0.z(n);
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    return a(mN);
  }
}

