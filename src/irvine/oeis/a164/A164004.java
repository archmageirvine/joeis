package irvine.oeis.a164;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A164004 Zero together with row 4 of the array in A163280.
 * @author Georg Fischer
 */
public class A164004 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A164004() {
    super(0, new long[] {0, -5, 5, -3, 1},
      new long[] {-1, 3, -3, 1});
  }
}
