package irvine.oeis.a381;
// Generated by gen_seq4.pl 2025-03-28.ack/lingf at 2025-03-28 22:47

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A381859 a(n) is the number of permutations that avoid 312 and 4321 and whose square avoids 321.
 * @author Georg Fischer
 */
public class A381859 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A381859() {
    super(0, "[1,-1]", "[1,-2,0,-1,0,1]");
  }
}
