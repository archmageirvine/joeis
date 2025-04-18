package irvine.oeis.a220;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A220997 Number of n X 2 arrays of occupancy after each element stays put or moves to some horizontal or vertical neighbor.
 * @author Georg Fischer
 */
public class A220997 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A220997() {
    super(1, "[0,3,-2,-2]", "[1,-11,11,12,2]");
  }
}
