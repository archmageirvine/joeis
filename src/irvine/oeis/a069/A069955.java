package irvine.oeis.a069;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A069955 Let W(n) = Product_{k=1..n} (1 - 1/4k^2), the partial Wallis product (lim_{n-&gt;infinity} W(n) = 2/Pi); then a(n) = numerator(W(n)).
 * @author Sean A. Irvine
 */
public class A069955 extends Sequence0 {

  private int mN = -1;
  private Q mProduct = Q.ONE;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    if (++mN > 0) {
      mProduct = mProduct.multiply(Q.ONE.subtract(new Q(1, 4L * mN * mN)));
    }
    return select(mProduct);
  }
}
