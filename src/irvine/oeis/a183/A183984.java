package irvine.oeis.a183;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A183984 1/4 the number of (n+1) X 8 binary arrays with all 2 X 2 subblock sums the same.
 * @author Georg Fischer
 */
public class A183984 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A183984() {
    super(1, new long[] {0, 81, -160, -163, 320},
      new long[] {1, -3, 0, 6, -4});
  }
}
