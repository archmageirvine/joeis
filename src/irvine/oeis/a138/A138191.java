package irvine.oeis.a138;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A138191 Denominator of (n-1)*n*(n+1)/12.
 * @author Georg Fischer
 */
public class A138191 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A138191() {
    super(1, new long[] {0, -32, -64, -32, -32},
      new long[] {-32, 0, 0, 0, 32});
  }
}
