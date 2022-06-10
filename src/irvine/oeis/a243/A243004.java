package irvine.oeis.a243;
// manually cordrec at 2022-06-09 19:34

import irvine.math.z.Z;
import irvine.oeis.recur.ConstantOrderRecurrence;

/**
 * A243004 a(n) = - (a(n-1) + 1) * a(n-2) with a(1) = a(2) = 1.
 * @author Georg Fischer
 */
public class A243004 extends ConstantOrderRecurrence {

  /** Construct the sequence */
  public A243004() {
    super(1, 2, 0, 1, 1);
  }

  @Override
  protected Z compute(final int n) {
    return a(n - 1).add(1).multiply(a(n - 2)).negate();
  }
}
