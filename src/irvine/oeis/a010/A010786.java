package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A010786 Floor-factorial numbers: a(n) = Product_{k=1..n} floor(n/k).
 * @author Sean A. Irvine
 */
public class A010786 extends AbstractSequence implements DirectSequence {

  private int mN;

  /** Construct the sequence. */
  public A010786() {
    super(0);
    mN = -1;
  }

  @Override
  public Z a(final Z nz) {
    return a(nz.intValueExact());
  }

  @Override
  public Z a(final int n) {
    Z prod = Z.ONE;
    for (long k = 1; k <= n; ++k) {
      prod = prod.multiply(n / k);
    }
    return prod;
  }

  @Override
  public Z next() {
    return a(++mN);
  }

}
