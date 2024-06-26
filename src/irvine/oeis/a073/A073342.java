package irvine.oeis.a073;
// Generated by gen_seq4.pl 2024-03-30/tuptraf at 2024-03-30 20:29

import irvine.math.q.Q;
import irvine.oeis.a007.A007605;
import irvine.oeis.a097.A097944;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A073342 Average digit (rounded to the nearest integer) in the decimal expansion of n-th prime.
 * @author Georg Fischer
 */
public class A073342 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A073342() {
    super(1, (n, s) -> new Q(s[0], s[1]).round(), "", new A007605(), new A097944());
  }
}
