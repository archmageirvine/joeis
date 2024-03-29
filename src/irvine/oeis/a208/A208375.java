package irvine.oeis.a208;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A208375 Number of n X 4 0..1 arrays avoiding 0 0 0 and 1 1 1 horizontally and 0 0 1 and 1 0 1 vertically.
 * @author Georg Fischer
 */
public class A208375 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A208375() {
    super(1, new long[] {0, 10, 70, -30, -10},
      new long[] {1, -3, 3, -1});
  }
}
