package irvine.oeis.a036;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A036544 a(n) = (2*(1 + n + (((10^n-1)/9) - n)/9)).
 * @author Georg Fischer
 */
public class A036544 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A036544() {
    super(0, new long[] {2, -20, 2},
      new long[] {1, -12, 21, -10});
  }
}
