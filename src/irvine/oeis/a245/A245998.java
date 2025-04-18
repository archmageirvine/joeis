package irvine.oeis.a245;
// Generated by gen_seq4.pl 2024-12-28.ack/lingfcj at 2024-12-28 22:36

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A245998 Number of length 3+2 0..n arrays with no pair in any consecutive three terms totalling exactly n.
 * @author Georg Fischer
 */
public class A245998 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A245998() {
    super(1, "[0,2,12,110,200,366,172,98]", "[1,-3,0,8,-6,-6,8,0,-3,1]");
  }
}
