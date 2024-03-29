package irvine.oeis.a072;
// Generated by gen_seq4.pl cordrec at 2022-06-09 21:29

import irvine.math.z.Z;
import irvine.oeis.recur.ConstantOrderRecurrence;

/**
 * A072879 a(n) = 5*a(n-1)*a(n-2)*a(n-3)*a(n-4) - a(n-5) with a(1) = a(2) = a(3) = a(4) = a(5) = 1.
 * <code>a(n) = 5*a(n-1)*a(n-2)*a(n-3)*a(n-4) - a(n-5)</code>
 * @author Georg Fischer
 */
public class A072879 extends ConstantOrderRecurrence {

  /** Construct the sequence */
  public A072879() {
    super(1, 5, 0, 1, 1, 1, 1, 1);
  }

  @Override
  protected Z compute(final int n) {
    return a(n - 1).multiply(5).multiply(a(n - 2)).multiply(a(n - 3)).multiply(a(n - 4)).subtract(a(n - 5));
  }
}
