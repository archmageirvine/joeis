package irvine.oeis.a154;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A154383 Powers of 4 at even indices, two times powers of 4 at odd indices.
 * @author Georg Fischer
 */
public class A154383 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A154383() {
    super(0, new long[] {1, 0, 0, 2},
      new long[] {1, 0, -4});
  }
}
