package irvine.oeis.a072;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A072850 Number of permutations satisfying i-2&lt;=p(i)&lt;=i+4, i=1..n.
 * @author Georg Fischer
 */
public class A072850 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A072850() {
    super(1, new long[] {-1, 0, 1, 2, 2, 0, 2, -1, 0, -1},
      new long[] {-1, 1, 2, 4, 6, 10, 12, -4, -6, -6, 0, -2, -2, 0, 1, 1});
  }
}
