package irvine.oeis.a221;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A221567 Number of 0..2 arrays of length n with each element differing from at least one neighbor by something other than 1.
 * @author Georg Fischer
 */
public class A221567 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A221567() {
    super(1, "[0,0,5,-6,8]", "[1,-3,2,0,-4]");
  }
}
