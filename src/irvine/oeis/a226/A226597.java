package irvine.oeis.a226;
// manually cordrec at 2022-06-09 19:34

import irvine.math.z.Z;
import irvine.oeis.recur.ConstantOrderRecurrence;

/**
 * A226597 a(n) = c(1, 2,...,n), the Cantor tuple function c applied to n-tuple (1, 2,...,n).
 * <code>a(n) = (a(n-1)+n)*(a(n-1)+n+1)/2+n</code>
 * @author Georg Fischer
 */
public class A226597 extends ConstantOrderRecurrence {

  /** Construct the sequence */
  public A226597() {
    super(0, 1, 0, 0, 1);
  }

  @Override
  protected Z compute(final int n) {
    return a(n - 1).add(n).multiply(a(n - 1).add(n + 1)).divide(2).add(n);
  }
}
