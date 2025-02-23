package irvine.oeis.a188;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A188501 Number of n X 2 binary arrays without the pattern 0 1 0 diagonally, vertically or horizontally.
 * @author Georg Fischer
 */
public class A188501 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A188501() {
    super(1, "[0,4,4,5,1,-2,-1]", "[1,-3,1,-3,-3,1,1]");
  }
}
