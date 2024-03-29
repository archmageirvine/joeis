package irvine.oeis.a207;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A207388 Number of n X 5 0..1 arrays avoiding 0 0 1 and 0 1 0 horizontally and 0 0 1 and 1 1 0 vertically.
 * @author Georg Fischer
 */
public class A207388 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A207388() {
    super(1, new long[] {0, 14, 112, -132, 12, 12, -2},
      new long[] {1, -6, 15, -20, 15, -6, 1});
  }
}
