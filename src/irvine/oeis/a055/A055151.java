package irvine.oeis.a055;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.triangle.DoubleRowTriangle;

/**
 * A055151 Triangular array of Motzkin polynomial coefficients.
 * <code>T(n,k) = n!/((n-2k)! k! (k+1)!)</code>.
 * @author Georg Fischer
 */
public class A055151 extends DoubleRowTriangle {


  /** Construct the sequence. */
  public A055151() {
    hasRAM(true);
  }

  @Override
  public Z compute(final int n, final int k) {
    return Functions.FACTORIAL.z(n).divide(Functions.FACTORIAL.z(n - 2 * k).multiply(Functions.FACTORIAL.z(k)).multiply(Functions.FACTORIAL.z(k + 1)));
  }
}
