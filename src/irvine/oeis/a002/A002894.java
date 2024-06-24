package irvine.oeis.a002;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a000.A000984;

/**
 * A002894 a(n) = binomial(2n, n)^2.
 * @author Sean A. Irvine
 */
public class A002894 extends A000984 implements DirectSequence {

  @Override
  public Z next() {
    return super.next().square();
  }

  @Override
  public Z a(final Z n) {
    return Binomial.binomial(n.multiply2(), n).square();
  }

  @Override
  public Z a(final int n) {
    return Binomial.binomial(n * 2, n).square();
  }

}
