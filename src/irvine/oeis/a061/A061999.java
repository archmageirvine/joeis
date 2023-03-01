package irvine.oeis.a061;
// manually 2023-02-28

import irvine.math.z.Z;
import irvine.oeis.recur.ConstantOrderRecurrence;

/**
 * A061999 a(n) = 2*a(n-1)^2 - 2*a(n-2)^2 with a(0) = 0, a(1) = 1.
 * @author Georg Fischer
 */
public class A061999 extends ConstantOrderRecurrence {

  /** Construct the sequence */
  public A061999() {
    super(0, 2, 0, 0, 1);
  }

  @Override
  protected Z compute(final int n) {
    return a(n - 1).square().multiply2().subtract(a(n - 2).square().multiply2());
  }
}
