package irvine.oeis.a206;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A206200 Number of (n+1) X 3 0..3 arrays with every 2 X 3 or 3 X 2 subblock having exactly one clockwise edge increases.
 * @author Georg Fischer
 */
public class A206200 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A206200() {
    super(1, "[0,480,1060,1568,-436,152,164,68,-36,-12]", "[1,0,-3,-14,3,-1,-1,-1]");
  }
}
