package irvine.oeis.a068;
// manually at 2023-07-08

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A068106 Euler's difference table: triangle read by rows, formed by starting with factorial numbers (A000142) and repeatedly taking differences. T(n,n) = n!, T(n,k) = T(n,k+1) - T(n-1,k).
 * formed by starting with factorial numbers (A000142) and repeatedly taking differences.
 * T(n,n) = n!, T(n,k) = T(n,k+1) - T(n-1,k).
 * @author Georg Fischer
 */
public class A068106 extends BaseTriangle {

  /** Construct the sequence. */
  public A068106() {
    super();
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    // T(n, k) = Sum_{j=0..n} (-1)^j*binomial(n-k, j)*(n-j)!
    return Integers.SINGLETON.sum(0, n, j -> Binomial.binomial(n - k, j).multiply(Functions.FACTORIAL.z(n - j)).multiply(((j & 1) == 0) ? 1 : -1));
  }
}
