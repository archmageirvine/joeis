package irvine.oeis.a081;
// manually cordrec at 2022-06-04 10:00

import irvine.math.z.Z;
import irvine.oeis.recur.ConstantOrderRecurrence;

/**
 * A081090 a(n) = a(n-2)*(a(n-1)^2 + 1)
 * @author Georg Fischer
 */
public class A081090 extends ConstantOrderRecurrence {

  /** Construct the sequence */
  public A081090() {
    super(1, 2, 0, 0, 2, 5);
  }

  @Override
  protected Z compute(final int n) {
    return a(n - 2).multiply(a(n - 1).square().add(1));
  }
}
