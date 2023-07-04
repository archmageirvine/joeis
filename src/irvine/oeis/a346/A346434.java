package irvine.oeis.a346;
// manually 2023-06-30

import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A346434 Triangle read by rows of numbers with n 1&apos;s and n 0&apos;s in their representation in base of Fibonacci numbers (A210619), written as those 1&apos;s and 0&apos;s.
 * @author Georg Fischer
 */
public class A346434 extends BaseTriangle {

  private final static Z Z100 = Z.valueOf(100);

  /** Construct the sequence. */
  public A346434() {
    super(1, 1, 1);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    // T(n,k) = (10*100^n - 9*100^(n-k) - 1)/99, for n>=1 and 1 <= k <= n.
    return Z100.pow(n).multiply(10).subtract(Z100.pow(n - k).multiply(9)).subtract(1).divide(99);
  }
}
