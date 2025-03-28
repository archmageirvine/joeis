package irvine.oeis.a186;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A186565 Number of (n+2) X 8 0..2 arrays with every 3 X 3 subblock commuting with each horizontal and vertical neighbor 3 X 3 subblock.
 * @author Georg Fischer
 */
public class A186565 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A186565() {
    super(1, "[0,20056,-36733,18903,-35048,76670,-41754,-50588,29502,10296,1536,-10944,-4800,0,21632]", "[1,-2,1,-2,4,-2,-2,2]");
  }
}
