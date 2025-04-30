package irvine.oeis.a005;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A005773 Number of directed animals of size n (or directed n-ominoes in standard position).
 * @author Georg Fischer
 */
public class A005773 extends HolonomicRecurrence implements DirectSequence {

  /** Construct the sequence. */
  public A005773() {
    // D-finite with recurrence n*a(n) = 2*n*a(n-1) + 3*(n-2)*a(n-2), a(0)=a(1)=1.
    super(0, "[[0],[-6, 3],[0, 2],[0,-1]]", "1, 1, 2", 0, 0);
  }

  @Override
  public Z a(final Z n) {
    return a(n.intValueExact());
  }

  @Override
  public Z a(final int n) {
    // a(n) = Sum_{q=0..n} binomial(q, floor(q/2))*binomial(n-1, q) for n > 0
    return n == 0 ? Z.ONE : Integers.SINGLETON.sum(0, n, k -> Binomial.binomial(k, k / 2).multiply(Binomial.binomial(n - 1, k)));
  }

}
