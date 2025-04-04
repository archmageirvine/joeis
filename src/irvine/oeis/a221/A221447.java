package irvine.oeis.a221;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A221447 Hilltop maps: number of 2 X n binary arrays indicating the locations of corresponding elements not exceeded by any horizontal or antidiagonal neighbor in a random 0..1 2 X n array.
 * @author Georg Fischer
 */
public class A221447 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A221447() {
    super(1, "[0,1,6,5,4,-1,-2,-1]", "[1,-3,-1,-5,-1,-1,1,1]");
  }
}
