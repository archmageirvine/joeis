package irvine.oeis.a383;
// Generated by gen_seq4.pl 2025-05-22.ack/lingf at 2025-05-22 22:55

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A383549 Number of rises in all compositions of n with parts in {1,2,3} and adjacent differences in {-1,1}.
 * @author Georg Fischer
 */
public class A383549 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A383549() {
    super(0, "[0,0,0,1,1,2,3,1,3,0,1]", "[1,0,0,-2,0,-2,1,0,2,0,1]");
  }
}
