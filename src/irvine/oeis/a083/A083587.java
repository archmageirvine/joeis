package irvine.oeis.a083;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A083587 a(n) = 4*3^n/3 - 5*0^n/6 - (n-1)2^(n-1).
 * @author Georg Fischer
 */
public class A083587 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A083587() {
    super(0, new long[] {-1, 3, 2, -10},
      new long[] {-1, 7, -16, 12});
  }
}
