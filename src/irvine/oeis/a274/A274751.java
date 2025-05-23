package irvine.oeis.a274;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A274751 Number of 4 X n 0..2 arrays with no element equal to any value at offset (-1,-2) (0,-1) or (-1,0) and new values introduced in order 0..2.
 * @author Georg Fischer
 */
public class A274751 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A274751() {
    super(1, "[0,4,19,10,-55,-46,45,6,-6]", "[1,-2,-20,-10,44,20,-31,-2,4]");
  }
}
