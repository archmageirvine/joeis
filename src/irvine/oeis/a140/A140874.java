package irvine.oeis.a140;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A140874 Triangle T(n,k) = binomial(n,k+2)-2*binomial(n,k+1)-binomial(n,k) read by rows, 0&lt;=k&lt;=n-2, n&gt;=2.
 * @author Georg Fischer
 */
public class A140874 extends BaseTriangle {

  /** Construct the sequence. */
  public A140874() {
    super(2, 2, 0);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return Binomial.binomial(n, k + 2).subtract(Binomial.binomial(n, k + 1).multiply2()).subtract(Binomial.binomial(n, k));
  }
}
