package irvine.oeis.a271;
// manually at 2024-03-28

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A271825 Triangle read by rows: T(n,m) = (-1)^(n-m-1)*m*binomial(2*n-3*m-1,n-m-1)/(n-m), T(n,n)=1.
 * @author Georg Fischer
 */
public class A271825 extends LambdaTriangle {

  /** Construct the sequence. */
  public A271825() {
    super(1, 1, 1, (n, k) -> (n == k) ? Z.ONE : Z.NEG_ONE.pow(n - k - 1).multiply(k)
      .multiply(Binomial.binomial(2 * n - 3 * k - 1, n - k - 1)).divide(n - k));
  }
}
