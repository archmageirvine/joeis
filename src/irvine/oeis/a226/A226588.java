package irvine.oeis.a226;
// manually cordrec at 2022-06-09 19:34

import irvine.math.z.Z;
import irvine.oeis.recur.ConstantOrderRecurrence;

/**
 * A226588 a(n) = c({1}^n), the Cantor tuple function c applied to an n-tuple of 1's.
 * <code>a(n) = (a(n-1)+1)*(a(n-1)+2)/2+1</code>
 * @author Georg Fischer
 */
public class A226588 extends ConstantOrderRecurrence {

  /** Construct the sequence */
  public A226588() {
    super(0, 1, 0, 0, 1);
  }

  @Override
  protected Z compute(final int n) {
    return a(n - 1).add(1).multiply(a(n - 1).add(2)).divide2().add(1);
  }
}
