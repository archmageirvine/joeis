package irvine.oeis.a276;
// Generated by gen_seq4.pl cordrec at 2022-06-09 21:29

import irvine.math.z.Z;
import irvine.oeis.recur.ConstantOrderRecurrence;

/**
 * A276257 a(1) = a(2) = a(3) = a(4) = 1; for n&gt;4, a(n) = ( a(n-1)+a(n-2)+a(n-3)+1 )^2 / a(n-4).
 * <code>a(n) = 25*a(n-1)*a(n-2)*a(n-3) - 2*a(n-1) - 2*a(n-2) - 2*a(n-3)</code>
 * @author Georg Fischer
 */
public class A276257 extends ConstantOrderRecurrence {

  /** Construct the sequence */
  public A276257() {
    super(1, 4, 0, 1, 1, 1, 1);
  }

  @Override
  protected Z compute(final int n) {
    return a(n - 1).multiply(25).multiply(a(n - 2)).multiply(a(n - 3)).subtract(Z.TWO.multiply(a(n - 1))).subtract(Z.TWO.multiply(a(n - 2))).subtract(Z.TWO.multiply(a(n - 3))).subtract(2).subtract(a(n - 4));
  }
}
