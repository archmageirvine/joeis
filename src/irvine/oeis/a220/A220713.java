package irvine.oeis.a220;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A220713 Number of ways to reciprocally link elements of an n X 2 array either to themselves or to exactly two king-move neighbors, without consecutive collinear links.
 * @author Georg Fischer
 */
public class A220713 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A220713() {
    super(1, "[0,1,6,2,-1,-3,1]", "[1,-2,-8,-3,2,3,-1]");
  }
}
