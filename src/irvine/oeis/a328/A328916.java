package irvine.oeis.a328;
// manually cordrec at 2022-06-09 14:26

import irvine.math.z.Z;
import irvine.oeis.recur.ConstantOrderRecurrence;

/**
 * A328916 Number of n-digit decimal numbers containing 123 as a substring.
 * <code>a(n) = 10*a(n-1) + 9*10^(n-4) - a(n-3)</code>
 * @author Georg Fischer
 */
public class A328916 extends ConstantOrderRecurrence {

  /** Construct the sequence */
  public A328916() {
    super(0, 3, 0, "0, 0, 0, 1, 19");
  }

  @Override
  protected Z compute(final int n) {
    return Z.TEN.pow(n - 4).multiply(9).add(a(n - 1).multiply(10)).subtract(a(n - 3));
  }
}
