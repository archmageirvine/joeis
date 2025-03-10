package irvine.oeis.a235;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A235303 Number of (n+1) X (1+1) 0..5 arrays with every 2 X 2 subblock having its diagonal sum differing from its antidiagonal sum by 6 (constant-stress 1 X 1 tilings).
 * @author Georg Fischer
 */
public class A235303 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A235303() {
    super(1, "[0,70,0,-1022,0,3600]", "[1,-3,-13,39,40,-120]");
  }
}
