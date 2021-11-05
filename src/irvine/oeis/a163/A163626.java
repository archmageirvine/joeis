package irvine.oeis.a163;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A163626 Triangle read by rows: The n-th derivative of the logistic function written in terms of y, where y = 1/(1 + exp(-x)).
 * T(n, k) = (k+1)*T(n-1,k) - k*T(n-1,k-1)
 * @author Georg Fischer
 */
public class A163626 extends Triangle {

  @Override
  public Z compute(final int n, final int k) {
    return n == 0 ? Z.ONE : get(n - 1, k).multiply(k + 1).subtract(get(n - 1, k - 1).multiply(k));
  }
}
