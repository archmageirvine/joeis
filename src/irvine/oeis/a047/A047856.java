package irvine.oeis.a047;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A047856 a(n) = A047848(8, n).
 * @author Georg Fischer
 */
public class A047856 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A047856() {
    super(0, new long[] {1, -10},
      new long[] {1, -12, 11});
  }
}
