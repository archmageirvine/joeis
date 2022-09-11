package irvine.oeis.a095;

import irvine.math.z.Z;
import irvine.oeis.recur.ConstantOrderRecurrence;

/**
 * A095232 a(1) = 1, a(n+1) = floor(a(n)*10^n/n).
 * @author Georg Fischer
 */
public class A095232 extends ConstantOrderRecurrence {

  /** Construct the sequence. */
  public A095232() {
    super(1, 1, 0, 1);
  }

  @Override
  public Z compute(final int n) {
    return a(n - 1).multiply(Z.TEN.pow(n - 1)).divide(n - 1);
  }
}
