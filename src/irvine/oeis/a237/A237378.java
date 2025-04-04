package irvine.oeis.a237;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A237378 Number of (n+1) X (2+1) 0..2 arrays with the maximum plus the minimum minus the upper median minus the lower median of every 2 X 2 subblock differing from its horizontal and vertical neighbors by exactly one.
 * @author Georg Fischer
 */
public class A237378 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A237378() {
    super(1, "[0,344,2064,12408,76188,1080,-2580]", "[1,0,0,0,-1320]");
  }
}
