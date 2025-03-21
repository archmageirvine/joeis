package irvine.oeis.a275;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A275267 Number of 3 X n 0..2 arrays with no element equal to any value at offset (-2,-1) (-2,1) or (-1,-1) and new values introduced in order 0..2.
 * @author Georg Fischer
 */
public class A275267 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A275267() {
    super(1, "[0,5,-6,-6,-2]", "[1,-6,2,6]");
  }
}
