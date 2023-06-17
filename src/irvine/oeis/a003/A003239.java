package irvine.oeis.a003;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Binomial;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A003239 Number of rooted planar trees with n non-root nodes: circularly cycling the subtrees at the root gives equivalent trees.
 * @author Sean A. Irvine
 */
public class A003239 extends AbstractSequence {

  /* Construct the sequence. */
  public A003239() {
    super(0);
  }

  protected long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z s = Z.ZERO;
    for (final Z d : Jaguar.factor(mN).divisors()) {
      s = s.add(Binomial.binomial(d.multiply2(), d).multiply(Euler.phiAsLong(mN / d.longValueExact())));
    }
    return s.divide(2 * mN);
  }
}
