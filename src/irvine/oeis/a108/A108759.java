package irvine.oeis.a108;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.DoubleRowTriangle;

/**
 * A108759 Triangle read by rows: T(n,k) = binomial(3k,k)*binomial(n+k, 3k)/(2k+1) (0&lt;=k&lt;=floor(n/2)).
 * @author Georg Fischer
 */
public class A108759 extends DoubleRowTriangle {

  @Override
  public Z compute(final int n, final int k) {
    return n <= 1 ? Z.ONE : Binomial.binomial(3 * k, k).multiply(Binomial.binomial(n + k, 3 * k)).divide(2 * k + 1);
  }
}
