package irvine.oeis.a205;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A205513 Number of (n+1) X 2 0..2 arrays with the number of clockwise edge increases in every 2 X 2 subblock differing from each horizontal or vertical neighbor.
 * @author Georg Fischer
 */
public class A205513 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A205513() {
    super(1, "[0,81,360,225,606,-36,-54,-66]", "[1,0,-18,-6,-39,2,3,4]");
  }
}
