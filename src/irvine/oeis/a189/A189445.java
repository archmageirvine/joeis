package irvine.oeis.a189;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A189445 Number of n X 5 array permutations with each element moving zero or one space horizontally or diagonally.
 * @author Georg Fischer
 */
public class A189445 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A189445() {
    super(1, "[0,8,33,-168,571,-537,-51]", "[1,-24,19,11,-36,-3]");
  }
}
