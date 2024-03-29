package irvine.oeis.a259;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A259658 Let f(x) be the absolute value of the difference between x and its base-2 reversal. Let g(x) be the number of times f(x) must be applied to x for the result to be 0. a(n) is the smallest value of x for which g(x) is n.
 * @author Georg Fischer
 */
public class A259658 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A259658() {
    super(0, new long[] {0, 1, 2, 8, 32, 240, 434, 1302, 1068, 2870, 11200, 13708, -12800, 
      -18144},
      new long[] {1, 0, -3, 0, 2});
  }
}
