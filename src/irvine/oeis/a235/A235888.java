package irvine.oeis.a235;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A235888 Number of (n+1) X (3+1) 0..3 arrays with the minimum plus the upper median equal to the lower median plus the maximum in every 2 X 2 subblock.
 * @author Georg Fischer
 */
public class A235888 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A235888() {
    super(1, new long[] {0, 352, -1896, 2048},
      new long[] {1, -7, 14, -8});
  }
}
