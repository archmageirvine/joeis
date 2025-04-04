package irvine.oeis.a207;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A207144 Number of (n+1) X 4 0..2 arrays with every 2 X 2 subblock having nonzero determinant and commuting with every horizontal or vertical neighbor.
 * @author Georg Fischer
 */
public class A207144 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A207144() {
    super(1, "[0,80,-24,-59,1,-1,1,-1,1,-1,1]", "[1,-1,-2,2]");
  }
}
