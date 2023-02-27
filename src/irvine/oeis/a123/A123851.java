package irvine.oeis.a123;

import irvine.math.z.Z;
import irvine.oeis.recur.ConstantOrderRecurrence;

/**
 * A123851 A cubic recurrence: a(0) = 1, a(n) = n*a(n-1)^3 for n &gt;= 1.
 * @author Georg Fischer
 */
public class A123851 extends ConstantOrderRecurrence {

  /** Construct the sequence. */
  public A123851() {
    super(0, 1, 0, 1);
  }

  @Override
  protected Z compute(final int n) {
    return a(n - 1).pow(3).multiply(n);
  }
}
