package irvine.oeis.a038;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A038110 Numerator of frequency of integers with smallest divisor prime(n).
 * @author Sean A. Irvine
 */
public class A038110 extends A000040 {

  private Q mProduct = null;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    mProduct = mProduct == null ? Q.ONE : mProduct.multiply(Q.ONE.subtract(new Q(Z.ONE, super.next())));
    return select(mProduct);
  }
}
