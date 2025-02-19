package irvine.oeis.a189;
// Generated by gen_seq4.pl 2024-12-28.ack/lingfcj at 2024-12-28 22:36

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A189145 Number of n X 2 array permutations with each element making zero or one knight moves.
 * @author Georg Fischer
 */
public class A189145 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A189145() {
    super(1, "[0,1,-2,4,1,-6,3,-3,1]", "[1,-3,3,-6,0,6,-3,3,-1]");
  }
}
