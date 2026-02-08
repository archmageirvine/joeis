package irvine.oeis.a045;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A045723 Number of configurations, excluding reflections and black-white interchanges, of n black and n white beads on a string.
 * @author Sean A. Irvine
 */
public class A045723 extends Sequence0 implements DirectSequence {

  private int mN = -1;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    return a(n.intValueExact());
  }

  @Override
  public Z a(final int n) {
    Z t = Z.ONE.shiftLeft(n).add(Binomial.binomial(2L * n, n));
    if ((n & 1) == 0) {
      t = t.add(Binomial.binomial(n - 1, (n - 2) / 2).multiply2());
    }
    return t.divide(4);
  }
}
