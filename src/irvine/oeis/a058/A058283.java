package irvine.oeis.a058;
// Generated by gen_seq4.pl cofr at 2021-07-23 19:30

import irvine.oeis.a092.A092426;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A058283 Continued fraction for e^4.
 * @author Georg Fischer
 */
public class A058283 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A058283() {
    super(0, new A092426());
  }
}
