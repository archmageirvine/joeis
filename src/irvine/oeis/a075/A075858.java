package irvine.oeis.a075;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A075858 n followed by n 1's.
 * @author Georg Fischer
 */
public class A075858 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A075858() {
    super(1, new long[] {0, 11, -20},
      new long[] {1, -21, 120, -100});
  }
}
