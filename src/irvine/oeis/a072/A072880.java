package irvine.oeis.a072;
// Generated by gen_seq4.pl cordrec at 2022-06-09 21:29

import irvine.math.z.Z;
import irvine.oeis.recur.ConstantOrderRecurrence;

/**
 * A072880 A recurrence of order 6: a(1)=a(2)=a(3)=a(4)=a(5)=a(6)=1; a(n) = (a(n-1)^2 + a(n-2)^2 + a(n-3)^2 + a(n-4)^2 + a(n-5)^2)/a(n-6).
 * <code>a(n) = 6*a(n-1)*a(n-2)*a(n-3)*a(n-4)*a(n-5) - a(n-6)</code>
 * @author Georg Fischer
 */
public class A072880 extends ConstantOrderRecurrence {

  /** Construct the sequence */
  public A072880() {
    super(1, 6, 0, 1, 1, 1, 1, 1, 1);
  }

  @Override
  protected Z compute(final int n) {
    return a(n - 1).multiply(6).multiply(a(n - 2)).multiply(a(n - 3)).multiply(a(n - 4)).multiply(a(n - 5)).subtract(a(n - 6));
  }
}
