package irvine.oeis.a217;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A217268 Number of n X 3 arrays of occupancy after each element moves to some horizontal or vertical neighbor.
 * @author Georg Fischer
 */
public class A217268 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A217268() {
    super(1, "[0,2,16,-64,-176,270]", "[1,-24,0,648,-729]");
  }
}
