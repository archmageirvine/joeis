package irvine.oeis.a218;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A218065 Number of 2 X n arrays of the minimum value of corresponding elements and their horizontal or antidiagonal neighbors in a random 0..1 2 X n array.
 * @author Georg Fischer
 */
public class A218065 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A218065() {
    super(1, "[0,4,2,-4,-4]", "[1,-1,-4,-1,3,2]");
  }
}
