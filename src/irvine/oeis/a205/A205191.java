package irvine.oeis.a205;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A205191 Number of (n+1) X 7 0..1 arrays with the number of clockwise edge increases in every 2 X 2 subblock differing from each horizontal or vertical neighbor.
 * @author Georg Fischer
 */
public class A205191 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A205191() {
    super(1, "[0,216,56,-104,136,-8,264,-8,-80,-64,-64]", "[1,-1,-1,1,-1,1,-1]");
  }
}
