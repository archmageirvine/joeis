package irvine.oeis.a174;
// Generated by gen_seq4.pl cordrec at 2022-06-09 21:29

import irvine.math.z.Z;
import irvine.oeis.recur.ConstantOrderRecurrence;

/**
 * A174677 a(n) = 2*a(n-1)*a(n-2) with a(0)=1 and a(1)=1.
 * <code>a(n) = 2*a(n-1)*a(n-2)</code>
 * @author Georg Fischer
 */
public class A174677 extends ConstantOrderRecurrence {

  /** Construct the sequence */
  public A174677() {
    super(0, 2, 0, 1, 1);
  }

  @Override
  protected Z compute(final int n) {
    return a(n - 1).multiply(2).multiply(a(n - 2));
  }
}
