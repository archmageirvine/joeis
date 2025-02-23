package irvine.oeis.a203;
// Generated by gen_seq4.pl 2024-12-28.ack/lingfcj at 2024-12-28 22:36

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A203094 Number of nX1 0..3 arrays with every nonzero element less than or equal to some horizontal or vertical neighbor.
 * @author Georg Fischer
 */
public class A203094 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A203094() {
    super(1, "[0,1,0,6,0,5,0,1]", "[1,-4,6,-10,5,-6,1,-1]");
  }
}
