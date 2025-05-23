package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A006480 De Bruijn's S(3,n): (3n)!/(n!)^3.
 * @author Sean A. Irvine
 */
public class A006480 extends Sequence0 implements DirectSequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(2 * mN, mN).multiply(Binomial.binomial(3 * mN, mN));
  }

  @Override
  public Z a(final Z n) {
    return a(n.intValueExact());
  }

  @Override
  public Z a(final int n) {
    return Binomial.binomial(2L * n, n).multiply(Binomial.binomial(3L * n, n));
  }

}
