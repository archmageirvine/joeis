package irvine.oeis.a055;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.triangle.DoubleRowTriangle;

/**
 * A055151 Triangular array of Motzkin polynomial coefficients.
 * <code>T(n,k) = n!/((n-2k)! k! (k+1)!)</code>.
 * @author Georg Fischer
 */
public class A055151 extends DoubleRowTriangle {

  private static final MemoryFactorial FACTORIAL = MemoryFactorial.SINGLETON;

  /** Construct the sequence. */
  public A055151() {
    hasRAM(true);
  }

  @Override
  public Z compute(final int n, final int k) {
    return FACTORIAL.factorial(n).divide(FACTORIAL.factorial(n - 2 * k).multiply(FACTORIAL.factorial(k)).multiply(FACTORIAL.factorial(k + 1)));
  }
}
