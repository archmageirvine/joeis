package irvine.oeis.a156;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A156991 Triangle T(n,k) read by rows: T(n,k) = n! * binomial(n + k - 1, n).
 * @author Georg Fischer
 */
public class A156991 extends BaseTriangle {

  /** Construct the sequence. */
  public A156991() {
    super(0, 0, 0);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    // T(n, k) = RisingFactorial(n, k).
    // Table[n!*Binomial[n+k-1, n], {n, 0, 12}, {k, 0, n}]
    return Functions.FACTORIAL.z(n).multiply(Binomial.binomial(n + k - 1, n));
  }
}
