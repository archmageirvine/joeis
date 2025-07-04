package irvine.oeis.a345;
// Generated by gen_seq4.pl 2025-06-15.ack/filtpos at 2025-06-15 21:33

import irvine.oeis.FilterPositionSequence;

/**
 * A345944 Numbers k such that A002034(d) &lt; A002034(k) for all the proper divisors d of k.
 * @author Georg Fischer
 */
public class A345944 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A345944() {
    super(1, 1, new A345935(), ONE);
  }
}
