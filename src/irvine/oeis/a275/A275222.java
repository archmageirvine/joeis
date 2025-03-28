package irvine.oeis.a275;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A275222 Number of n X 2 0..2 arrays with no element equal to any value at offset (-2,-1) (-2,1) or (-1,0) and new values introduced in order 0..2.
 * @author Georg Fischer
 */
public class A275222 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A275222() {
    super(1, "[0,2,0,-5,0,0,1]", "[1,-3,1,0,2,-1]");
  }
}
