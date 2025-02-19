package irvine.oeis.a234;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A234543 Number of (n+1) X (1+1) 0..5 arrays with every 2 X 2 subblock having its diagonal sum differing from its antidiagonal sum by 3 (constant-stress 1 X 1 tilings).
 * @author Georg Fischer
 */
public class A234543 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A234543() {
    super(1, "[0,208,-36,-7288,0,8640]", "[1,-6,-34,204,40,-240]");
  }
}
