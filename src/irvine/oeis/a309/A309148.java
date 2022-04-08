package irvine.oeis.a309;

import irvine.math.z.Binomial;
import irvine.math.z.Euler;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A309148 A(n,k) is (1/k) times the number of n-member subsets of [k*n] whose elements sum to a multiple of n; square array A(n,k), n&gt;=1, k&gt;=1, read by antidiagonals.
 * @author Georg Fischer
 */
public class A309148 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A309148() {
    super(1, 1, -1);
    hasRAM(true);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return Integers.SINGLETON.sumdiv(n, d -> Binomial.binomial(d * k, d).multiply(((n + d) & 1) == 0 ? 1 : -1)
      .multiply(Euler.phi(Z.valueOf(n / d)))).divide(n * k);
  }
}
