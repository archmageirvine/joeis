package irvine.oeis.a235;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A235272 Number of (n+1) X (2+1) 0..4 arrays with every 2 X 2 subblock having its diagonal sum differing from its antidiagonal sum by 5 (constant-stress 1 X 1 tilings).
 * @author Georg Fischer
 */
public class A235272 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A235272() {
    super(1, "[0,100,108,-1328,-1156,6236,3864,-12312,-4032,8640]", "[1,-1,-15,15,80,-80,-180,180,144,-144]");
  }
}
