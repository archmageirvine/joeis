package irvine.oeis.a108;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A108673 a(n) = (n+1)(n+2)(n+3)(2n+3)(10n^2 + 27n + 20)/360.
 * @author Georg Fischer
 */
public class A108673 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A108673() {
    super(0, new long[] {1, 12, 21, 6},
      new long[] {1, -7, 21, -35, 35, -21, 7, -1});
  }
}
