package irvine.oeis.a152;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A152056 a(n) = ((9+sqrt(3))^n + (9-sqrt(3))^n)/2.
 * @author Georg Fischer
 */
public class A152056 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A152056() {
    super(0, new long[] {1, -9},
      new long[] {1, -18, 78});
  }
}
