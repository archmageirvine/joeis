package irvine.oeis.a136;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A136777 Number of multiplex juggling sequences of length n, base state &lt;2,1&gt; and hand capacity 2.
 * @author Georg Fischer
 */
public class A136777 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A136777() {
    super(1, new long[] {0, 1, -4, 3},
      new long[] {1, -8, 13});
  }
}
