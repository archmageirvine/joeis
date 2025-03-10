package irvine.oeis.a234;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A234444 Number of (n+1) X (1+1) 0..4 arrays with every 2 X 2 subblock having its diagonal sum differing from its antidiagonal sum by 1 (constant-stress 1 X 1 tilings).
 * @author Georg Fischer
 */
public class A234444 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A234444() {
    super(1, "[0,160,1120,-1536,-8480]", "[1,0,-60,0,344]");
  }
}
