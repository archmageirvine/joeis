package irvine.oeis.a215;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A215546 Number of standard Young tableaux of shape [6n,6].
 * @author Georg Fischer
 */
public class A215546 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A215546() {
    super(0, new long[] {0, -132, -9072, -24892, -11921, -609, -35, 5},
      new long[] {-1, 7, -21, 35, -35, 21, -7, 1});
  }
}
