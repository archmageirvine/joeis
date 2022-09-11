package irvine.oeis.a096;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.recur.ConstantOrderRecurrence;

/**
 * A096138 a(1) = 1, a(n) = digit reversal of n*a(n-1).
 * @author Georg Fischer
 */
public class A096138 extends ConstantOrderRecurrence {

  /** Construct the sequence. */
  public A096138() {
    super(1, 1, 0, 1);
  }

  @Override
  public Z compute(final int n) {
    return ZUtils.reverse(a(n - 1).multiply(n));
  }
}
