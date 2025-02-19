package irvine.oeis.a194;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A194999 Number of lower triangles of a 3 X 3 0..n array with each element differing from all of its horizontal and vertical neighbors by one.
 * @author Georg Fischer
 */
public class A194999 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A194999() {
    super(1, "[0,2,16,4,2]", "[1,-2,1]");
  }
}
