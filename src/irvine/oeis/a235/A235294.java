package irvine.oeis.a235;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A235294 Number of (n+1) X (4+1) 0..3 arrays with every 2 X 2 subblock having its diagonal sum differing from its antidiagonal sum by 3 (constant-stress 1 X 1 tilings).
 * @author Georg Fischer
 */
public class A235294 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A235294() {
    super(1, "[0,744,-1100,-14308,21140,95228,-139616,-256584,369360,237312,-331776]", "[1,-3,-17,57,86,-372,-76,972,-360,-864,576]");
  }
}
