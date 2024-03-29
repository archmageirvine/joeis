package irvine.oeis.a064;
// Generated by gen_seq4.pl cordrec at 2022-06-09 21:29

import irvine.math.z.Z;
import irvine.oeis.recur.ConstantOrderRecurrence;

/**
 * A064183 Define a pair of sequences by p(0) = 0, q(0) = p(1) = q(1) = 1, q(n+1) = p(n)*q(n-1), p(n+1) = q(n+1) + q(n) for n &gt; 0; then a(n) = q(n) and A064526(n) = p(n).
 * <code>a(n) = (a(n-1) + a(n-2))*a(n-2)</code>
 * @author Georg Fischer
 */
public class A064183 extends ConstantOrderRecurrence {

  /** Construct the sequence */
  public A064183() {
    super(0, 2, 0, 1, 1, 1, 2);
  }

  @Override
  protected Z compute(final int n) {
    return a(n - 1).add(a(n - 2)).multiply(a(n - 2));
  }
}
