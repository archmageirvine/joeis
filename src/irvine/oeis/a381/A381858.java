package irvine.oeis.a381;
// Generated by gen_seq4.pl 2025-03-28.ack/lingf at 2025-03-28 22:47

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A381858 a(n) is the number of permutations of [n] that avoid 312 and 4321 and whose square avoids 231.
 * @author Georg Fischer
 */
public class A381858 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A381858() {
    super(0, "[1]", "[1,-1,-1,-2,-3,-2]");
  }
}
