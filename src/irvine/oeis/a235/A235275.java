package irvine.oeis.a235;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A235275 Number of (n+1) X (5+1) 0..4 arrays with every 2 X 2 subblock having its diagonal sum differing from its antidiagonal sum by 5 (constant-stress 1 X 1 tilings).
 * @author Georg Fischer
 */
public class A235275 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A235275() {
    super(1, "[0,1120,540,-16116,-6492,81620,24552,-172344,-29376,127296]", "[1,-1,-15,15,80,-80,-180,180,144,-144]");
  }
}
