package irvine.oeis.a233;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A233157 Number of 4 X n 0..2 arrays with no element x(i,j) adjacent to value 2-x(i,j) horizontally or antidiagonally.
 * @author Georg Fischer
 */
public class A233157 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A233157() {
    super(1, "[0,81,-345,351,-558,288,-1080,648]", "[1,-9,15,-6]");
  }
}
