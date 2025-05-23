package irvine.oeis.a269;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A269772 Number of length-n 0..4 arrays with every repeated value unequal to the previous repeated value plus one mod 4+1.
 * @author Georg Fischer
 */
public class A269772 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A269772() {
    super(1, "[0,5,-15,-15]", "[1,-8,12,16]");
  }
}
