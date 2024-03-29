package irvine.oeis.a221;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A221588 Equals one maps: number of n X 3 binary arrays indicating the locations of corresponding elements equal to exactly one of their king-move neighbors in a random 0..3 n X 3 array.
 * @author Georg Fischer
 */
public class A221588 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A221588() {
    super(1, new long[] {0, 4, -8, 66, 24, -328, 64},
      new long[] {1, -12, 32});
  }
}
