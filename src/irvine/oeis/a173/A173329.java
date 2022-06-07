package irvine.oeis.a173;
// manually cordrec at 2022-06-04 14:05

import irvine.math.z.Z;
import irvine.oeis.recur.ConstantOrderRecurrence;

/**
 * A173329 a(n) = a(n-2) + a(n-3) - floor(a(n-3)/2) - floor(a(n-6)/2).
 * @author Georg Fischer
 */
public class A173329 extends ConstantOrderRecurrence {

  /** Construct the sequence */
  public A173329() {
    super(0, 6, 0, 1, 1, 1, 2, 2, 3);
  }

  @Override
  protected Z compute(final int n) {
    return a(n - 2).add(a(n - 3)).subtract(a(n - 3).divide2()).subtract(a(n - 6).divide2());
  }
}
