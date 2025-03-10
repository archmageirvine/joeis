package irvine.oeis.a183;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A183813 1/81 the number of (n+1) X 3 0..2 arrays with no 2 X 2 subblock being a reflection across the shared element pair of any horizontal or vertical neighbor.
 * @author Georg Fischer
 */
public class A183813 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A183813() {
    super(1, "[0,8,42,-134]", "[1,-15,-120,330]");
  }
}
