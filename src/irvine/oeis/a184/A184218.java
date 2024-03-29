package irvine.oeis.a184;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A184218 a(n) = largest k such that A000217(n+1) = A000217(n) + (A000217(n) mod k), or 0 if no such k exists.
 * @author Georg Fischer
 */
public class A184218 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A184218() {
    super(1, new long[] {0, 0, 0, 0, 0, 9, -13, 5},
      new long[] {1, -3, 3, -1});
  }
}
