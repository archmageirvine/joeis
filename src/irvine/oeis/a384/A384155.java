package irvine.oeis.a384;
// Generated by gen_seq4.pl 2025-06-16.ack/lingf at 2025-06-16 21:55

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A384155 a(n) is the number of binary strings of length n whose shortest run of 1s is of length 3.
 * @author Georg Fischer
 */
public class A384155 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A384155() {
    super(0, "[0,0,0,1,-2,1]", "[1,-4,6,-4,0,1,1,-1,0,1]");
  }
}
