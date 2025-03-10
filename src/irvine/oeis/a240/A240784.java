package irvine.oeis.a240;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A240784 Number of 3 X n 0..1 arrays with no element equal to fewer vertical neighbors than horizontal neighbors, with new values 0..1 introduced in row major order.
 * @author Georg Fischer
 */
public class A240784 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A240784() {
    super(1, "[0,4,3,-6,-1,-4]", "[1,-2,-1,1,0,1]");
  }
}
