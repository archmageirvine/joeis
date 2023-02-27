package irvine.oeis.a114;

import irvine.math.z.Z;
import irvine.oeis.recur.ConstantOrderRecurrence;

/**
 * A114950 A quartic quadratic recurrence.
 * <code>a(0) = a(1) = 1, for n>1 a(n) = a(n-1)^4 + a(n-2)^2</code>
 * @author Georg Fischer
 */
public class A114950 extends ConstantOrderRecurrence {

  /** Construct the sequence. */
  public A114950() {
    super(0, 2, 0, 1, 1);
  }

  @Override
  protected Z compute(final int n) {
    return a(n - 1).pow(4).add(a(n - 2).square());
  }
}