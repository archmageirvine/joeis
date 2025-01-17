package irvine.oeis.a289;
// Generated by gen_seq4.pl 2024-12-15.ack/lambdan at 2024-12-15 23:09

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A289472 Number of gcds-sortable two-rooted graphs on n vertices.
 * @author Georg Fischer
 */
public class A289472 extends LambdaSequence {

  /** Construct the sequence. */
  public A289472() {
    super(1, n -> Rationals.SINGLETON.sum(0, n / 2 - 1, s -> new Q(Z.TWO.pow((long) s * s + 3L * s)).multiply(Rationals.SINGLETON.product(0, 2 * s - 1, i -> new Q(Z.TWO.pow(n - 2 - i)).subtract(1))).divide(Rationals.SINGLETON.product(1, s, i -> new Q(Z.TWO.pow(2L * i)).subtract(1)))).num());
  }
}
