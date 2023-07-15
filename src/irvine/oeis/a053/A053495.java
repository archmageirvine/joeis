package irvine.oeis.a053;
// manually at 2023-07-13

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A053495 Triangle formed by coefficients of numerator polynomials defined by iterating f(u,v) = 1/u - x*v applied to a list of elements {1,2,3,4,...}.
 * @author Georg Fischer
 */
public class A053495 extends BaseTriangle {

  /** Construct the sequence. */
  public A053495() {
    super(0, 0, 0);
  }

  @Override
  public Z triangleElement(final int r, final int c) {
    // Table[ (-1)^(r+c+1) binomial[Floor[(r+c)/2], Floor[(r-c)/2]] Floor[(r+c+1)/2]! / Floor[(r-c+1)/2]!, {r, 0, 7}, {c, 0, r}]
    return (r == 0)
      ? Z.ONE
      : Binomial.binomial((r + c) / 2, (r - c) / 2)
        .multiply(MemoryFactorial.SINGLETON.factorial((r + c + 1) / 2))
        .divide(MemoryFactorial.SINGLETON.factorial((r - c + 1) / 2))
        .multiply((((r + c + 1) & 1) == 0) ? 1 : -1);
  }
}
