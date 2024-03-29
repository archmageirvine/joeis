package irvine.oeis.a122;
// Generated by gen_seq4.pl cordrectab/cordrec at 2022-07-15 23:04

import irvine.math.z.Z;
import irvine.oeis.recur.ConstantOrderRecurrence;

/**
 * A122024 a(n) = (3*a(n - 1)a(n - 5) - a(n - 2)*a(n - 4))/a(n - 6); a(0) = 1, a(1) = 1, a(2) = 1, a(3) = 1, a(4) = 1, a(5) = 1.
 * <code>a(n)=(3*a(n-1)*a(n-5)-a(n-2)*a(n-4))/a(n-6)</code>
 * @author Georg Fischer
 */
public class A122024 extends ConstantOrderRecurrence {

  /** Construct the sequence */
  public A122024() {
    super(0, 6, 0, 1, 1, 1, 1, 1, 1);
  }

  @Override
  protected Z compute(final int n) {
    return a(n - 5).multiply(a(n - 1)).multiply(3).subtract(a(n - 2).multiply(a(n - 4))).divide(a(n - 6));
  }
}
