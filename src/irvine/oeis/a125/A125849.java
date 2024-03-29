package irvine.oeis.a125;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A125849 a(n) = Sum_{m=1..n-1} floor(m(n-2)/2)^2.
 * @author Georg Fischer
 */
public class A125849 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A125849() {
    super(0, new long[] {0, 0, 0, 1, 12, 31, 62, 35, 18, 1},
      new long[] {1, -2, -3, 8, 2, -12, 2, 8, -3, -2, 1});
  }
}
