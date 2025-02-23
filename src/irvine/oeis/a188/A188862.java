package irvine.oeis.a188;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A188862 Number of n X 5 binary arrays without the pattern 0 1 diagonally, vertically or antidiagonally.
 * @author Georg Fischer
 */
public class A188862 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A188862() {
    super(1, "[0,32,35,12,2]", "[1,-2,1]");
  }
}
