package irvine.oeis.a274;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A274745 Number of n X 4 0..2 arrays with no element equal to any value at offset (-1,-2) (0,-1) or (-1,0) and new values introduced in order 0..2.
 * @author Georg Fischer
 */
public class A274745 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A274745() {
    super(1, "[0,4,-2,-3,1]", "[1,-6,-1,2]");
  }
}
