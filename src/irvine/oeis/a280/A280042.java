package irvine.oeis.a280;
// Generated by gen_seq4.pl cordrec at 2022-06-09 21:29

import irvine.math.z.Z;
import irvine.oeis.recur.ConstantOrderRecurrence;

/**
 * A280042 a(1) = 1, a(n+1) is the numerator of n-th partial fraction of the continued fraction [1; 10, 100, 1000, ..., 10^n].
 * <code>a(n) = 10^(n-1)*a(n-1) + a(n-2)</code>
 * @author Georg Fischer
 */
public class A280042 extends ConstantOrderRecurrence {

  /** Construct the sequence */
  public A280042() {
    super(1, 2, 0, 1, 11);
  }

  @Override
  protected Z compute(final int n) {
    return Z.TEN.pow(Z.valueOf(n - 1)).multiply(a(n - 1)).add(a(n - 2));
  }
}
