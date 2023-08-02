package irvine.oeis.a155;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A155856 Triangle T(n,k) = binomial(2*n-k, k)*(n-k)!, read by rows.
 * @author Georg Fischer
 */
public class A155856 extends BaseTriangle {

  /** Construct the sequence. */
  public A155856() {
    super(0, 0, 0);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return Binomial.binomial(2L * n - k, k).multiply(MemoryFactorial.SINGLETON.factorial(n - k));
  }
}
