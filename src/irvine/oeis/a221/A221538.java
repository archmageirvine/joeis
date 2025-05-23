package irvine.oeis.a221;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A221538 Number of 0..4 arrays of length n with each element differing from at least one neighbor by something other than 1, starting with 0.
 * @author Georg Fischer
 */
public class A221538 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A221538() {
    super(1, "[0,0,4,-6,10,1,1]", "[1,-5,3,-1,-15,-3]");
  }
}
