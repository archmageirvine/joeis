package irvine.oeis.a083;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A083706 a(n) = 2^(n+1) + n - 1.
 * @author Georg Fischer
 */
public class A083706 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A083706() {
    super(0, new long[] {1, 0, -2},
      new long[] {1, -4, 5, -2});
  }
}
