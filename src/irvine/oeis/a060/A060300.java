package irvine.oeis.a060;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A060300 a(n) = (2*n*(n+1))^2.
 * @author Georg Fischer
 */
public class A060300 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A060300() {
    super(0, new long[] {0, 16, 64, 16},
      new long[] {1, -5, 10, -10, 5, -1});
  }
}
