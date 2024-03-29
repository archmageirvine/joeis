package irvine.oeis.a102;
// Generated by gen_seq4.pl somos3/cordrec at 2022-06-03 23:26

import irvine.math.z.Z;
import irvine.oeis.recur.ConstantOrderRecurrence;

/**
 * A102276 a(n) = (a(n-1) * a(n-5) + a(n-3)^2) / a(n-6) with a(0) = ... = a(5) = 1, a(n) = a(5-n) for all n in Z.
 * @author Georg Fischer
 */
public class A102276 extends ConstantOrderRecurrence {

  /** Construct the sequence */
  public A102276() {
    super(0, 6, 0, 1, 1, 1, 1, 1, 1);
  }

  @Override
  protected Z compute(final int n) {
    return a(n - 1).multiply(a(n - 5)).add(a(n - 3).square()).divide(a(n - 6));
  }
}
