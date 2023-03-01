package irvine.oeis.a114;

import irvine.math.z.Z;
import irvine.oeis.recur.ConstantOrderRecurrence;

/**
 * A114953 A cubic quartic recurrence.
 * <code>a(0) = a(1) = 1, for n>1 a(n) = a(n-1)^3 + a(n-2)^4.</code>
 * @author Georg Fischer
 */
public class A114953 extends ConstantOrderRecurrence {

  /** Construct the sequence. */
  public A114953() {
    super(0, 2, 0, 1, 1);
  }

  @Override
  protected Z compute(final int n) {
    return a(n - 1).pow(3).add(a(n - 2).pow(4));
  }
}
