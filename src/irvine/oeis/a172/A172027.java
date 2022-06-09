package irvine.oeis.a172;
// manually cordrec at 2022-06-09 09:11

import irvine.math.z.Z;
import irvine.oeis.recur.ConstantOrderRecurrence;

/**
 * A172027 a(n) = 1 + 3*a(n-1)*(a(n-1) + 1)
 * @author Georg Fischer
 */
public class A172027 extends ConstantOrderRecurrence {

  /** Construct the sequence */
  public A172027() {
    super(1, 1, 0, 1);
  }

  @Override
  protected Z compute(final int n) {
    return a(n - 1).multiply(3).multiply(a(n - 1).add(1)).add(1);
  }
}
