package irvine.oeis.a237;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A237631 Number of (n+1) X (2+1) 0..2 arrays with the upper median of every 2 X 2 subblock differing from its horizontal and vertical neighbors by exactly one.
 * @author Georg Fischer
 */
public class A237631 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A237631() {
    super(1, "[0,260,636,1220,1576,-8,-1426,-2820,-2268,-1228,-648,-136,10]", "[1,0,0,-3,-10,0,0,12,6]");
  }
}
