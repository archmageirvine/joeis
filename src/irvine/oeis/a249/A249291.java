package irvine.oeis.a249;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A249291 Number of length 1+3 0..n arrays with no four consecutive terms having the sum of any three elements equal to three times the fourth.
 * @author Georg Fischer
 */
public class A249291 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A249291() {
    super(1, "[0,14,24,34,58,0,14]", "[1,-3,2,1,0,-1,-2,3,-1]");
  }
}
