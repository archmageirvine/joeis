package irvine.oeis.a165;
// Generated by gen_seq4.pl cordrec at 2022-06-09 21:29

import irvine.math.z.Z;
import irvine.oeis.recur.ConstantOrderRecurrence;

/**
 * A165903 a(n) = (a(n-1)^2 + a(n-2)^2 + a(n-1)*a(n-2))/a(n-3) with three initial ones.
 * <code>a(n) = 6*a(n-1)*a(n-2)-a(n-1)-a(n-2)-a(n-3)</code>
 * @author Georg Fischer
 */
public class A165903 extends ConstantOrderRecurrence {

  /** Construct the sequence */
  public A165903() {
    super(0, 3, 0, 1, 1, 1);
  }

  @Override
  protected Z compute(final int n) {
    return a(n - 1).multiply(6).multiply(a(n - 2)).subtract(a(n - 1)).subtract(a(n - 2)).subtract(a(n - 3));
  }
}
