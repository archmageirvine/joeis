package irvine.oeis.a107;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A107299 a(n) = 4*a(n-1)-2*a(n-2)-3*a(n-3)+2*a(n-4), n&gt;5.
 * @author Georg Fischer
 */
public class A107299 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A107299() {
    super(0, new long[] {-3, 9, -4, -4, -1, 2},
      new long[] {-1, 4, -2, -3, 2});
  }
}
