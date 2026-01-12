package irvine.oeis.a089;
// manually 2026-01-09

import irvine.math.z.Z;
import irvine.oeis.recur.ConstantOrderRecurrence;

/**
 * A089983 1, 1, 1, 1, ... a, b, c, d, ab-cd, ...
 * <code>a(n) = a(n-4)*a(n-3) - a(n-2)*a(n-1)</code>
 * @author Georg Fischer
 */
public class A089983 extends ConstantOrderRecurrence {

  /** Construct the sequence */
  public A089983() {
    super(1, 4, 0, 1, 1, 1, 1);
  }

  @Override
  protected Z compute(final int n) {
    return a(n - 4).multiply(a(n - 3)).subtract(a(n - 2).multiply(a(n - 1)));
  }
}
