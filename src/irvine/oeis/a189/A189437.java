package irvine.oeis.a189;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A189437 Number of 5 X n array permutations with each element not moving, or moving one space N, SW or SE.
 * @author Georg Fischer
 */
public class A189437 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A189437() {
    super(1, "[0,1,10,-74,138,-75]", "[1,-10,17,47,-138,75]");
  }
}
