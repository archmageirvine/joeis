package irvine.oeis.a179;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A179900 Triangle T(n,k) read by rows: coefficient of [x^k] of the polynomial p_n(x)=(5-x)*p_{n-1}(x)-p_{n-2}(x), p_0=1, p_1=5-x.
 * T(n,k) = 5*T(n-1,k)-T(n-1,k-1)-T(n-2,k) starting T(0, 0)=1, T(1, 0)=5 and T(1, 1)=-1.
 * @author Georg Fischer
 */
public class A179900 extends Triangle {

  /** Construct the sequence. */
  public A179900() {
    super("1, 5,-1");
  }

  @Override
  public Z compute(final int n, final int k) {
    return n < 2 ? super.compute(n, k) : get(n - 1, k).multiply(5).subtract(get(n - 1, k - 1)).subtract(get(n - 2, k));
  }
}
