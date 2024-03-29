package irvine.oeis.a215;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A215864 Number of simple labeled graphs on n+4 nodes with exactly n connected components that are trees or cycles.
 * @author Georg Fischer
 */
public class A215864 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A215864() {
    super(0, new long[] {0, -137, -34, 59, 7},
      new long[] {-1, 9, -36, 84, -126, 126, -84, 36, -9, 1});
  }
}
