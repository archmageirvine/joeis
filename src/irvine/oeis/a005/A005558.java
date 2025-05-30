package irvine.oeis.a005;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A005558 a(n) is the number of n-step walks on square lattice such that 0 &lt;= y &lt;= x at each step.
 * @author Sean A. Irvine
 */
public class A005558 extends Sequence0 implements DirectSequence {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    return Binomial.binomial(mN + 1, (mN + 1) / 2).multiply(Binomial.binomial(mN, mN / 2))
      .subtract(Binomial.binomial(mN + 1, mN / 2).multiply(Binomial.binomial(mN, (mN - 1) / 2)));
  }

  @Override
  public Z a(final Z n) {
    return a(n.intValueExact());
  }

  @Override
  public Z a(final int n) {
    if (n == 0) {
      return Z.ONE;
    }
    return Binomial.binomial(n + 1, (n + 1) / 2).multiply(Binomial.binomial(n, n / 2))
      .subtract(Binomial.binomial(n + 1, n / 2).multiply(Binomial.binomial(n, (n - 1) / 2)));
  }
}

