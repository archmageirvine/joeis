package irvine.oeis.a368;
// Generated by gen_seq4.pl 2025-05-07.ack/prepend at 2025-05-07 22:15

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a025.A025487;

/**
 * A368681 Products of primorials that are perfect powers.
 * @author Georg Fischer
 */
public class A368681 extends PrependSequence {

  /** Construct the sequence. */
  public A368681() {
    super(1, new FilterSequence(0, new A025487(), v -> Predicates.POWER.is(v)), 1);
  }
}
