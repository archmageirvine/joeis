package irvine.oeis.a208;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A208140 Number of n X 6 0..1 arrays avoiding 0 0 1 and 0 1 1 horizontally and 0 0 1 and 1 0 1 vertically.
 * @author Georg Fischer
 */
public class A208140 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A208140() {
    super(1, new long[] {0, 16, 144, 144, 16},
      new long[] {1, -7, 21, -35, 35, -21, 7, -1});
  }
}
