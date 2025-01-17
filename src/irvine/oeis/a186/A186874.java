package irvine.oeis.a186;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A186874 Number of (n+2) X 4 0..3 arrays with every 3 X 3 subblock commuting with each horizontal and vertical neighbor 3 X 3 subblock.
 * @author Georg Fischer
 */
public class A186874 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A186874() {
    super(1, "[0,2428,-4435,2787,-2436,15069,-11457,-22980,1305,12492,7047]", "[1,-2,1,-3,6,-3,-3,3]");
  }
}
