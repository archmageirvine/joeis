package irvine.oeis.a234;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A234264 Number of (n+1) X (6+1) 0..2 arrays with every 2 X 2 subblock having its diagonal sum differing from its antidiagonal sum by 2 (constant-stress 1 X 1 tilings).
 * @author Georg Fischer
 */
public class A234264 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A234264() {
    super(1, "[0,1336,-2318,-10762,18568,16500,-27864]", "[1,-3,-6,24,-4,-36,24]");
  }
}
