package irvine.oeis.a076;
// Generated by gen_seq4.pl 2024-04-11/tuptraf at 2024-04-11 21:12

import irvine.math.q.Q;
import irvine.oeis.a000.A000142;
import irvine.oeis.a048.A048855;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A076358 a(n) = numerator(n!/phi(n!)).
 * @author Georg Fischer
 */
public class A076358 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A076358() {
    super(1, (n, s) -> new Q(s[0], s[1]).num(), "", new A000142().skip(1), new A048855().skip(1));
  }
}
