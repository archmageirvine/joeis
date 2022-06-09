package irvine.oeis.a263;
// manually cordrec at 2022-06-09 19:34

import irvine.math.z.Z;
import irvine.oeis.recur.ConstantOrderRecurrence;

/**
 * A263044 a(1) = a(2) = a(3) = 1; for n&gt;3, a(n) = (a(n-3) + a(n-1))*(a(n-2) + a(n-3)).
 * @author Georg Fischer
 */
public class A263044 extends ConstantOrderRecurrence {

  /** Construct the sequence */
  public A263044() {
    super(1, 3, 0, 1, 1, 1);
  }

  @Override
  protected Z compute(final int n) {
    return a(n - 3).add(a(n - 1)).multiply(a(n - 2).add(a(n - 3)));
  }
}
