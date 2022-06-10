package irvine.oeis.a193;
// manually cordrec at 2022-06-09 19:17

import irvine.math.z.Z;
import irvine.oeis.recur.ConstantOrderRecurrence;

/**
 * A193465 Row sums of triangle A061312.
 * <code>a(n) = ((n-n^3)*a(n-3) + (2*n+n^2-n^3)*a(n-2) - (1-n-2*n^2)*a(n-1))/n</code>
 * @author Georg Fischer
 */
public class A193465 extends ConstantOrderRecurrence {

  /** Construct the sequence */
  public A193465() {
    super(0, 3, 0, 0, 2, 9);
  }

  @Override
  protected Z compute(final int n) {
    return (a(n - 3).multiply(n - n * n * n).add(a(n - 2).multiply(2 * n + n * n - n * n * n)).subtract(a(n - 1).multiply(1 - n - 2 * n * n))).divide(n);
  }
}
