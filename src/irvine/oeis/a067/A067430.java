package irvine.oeis.a067;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A067430 Convolution of Fibonacci F(n+1), n&gt;=0, with F(n+7), n&gt;=0.
 * @author Georg Fischer
 */
public class A067430 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A067430() {
    super(0, new long[] {13, 8},
      new long[] {1, -2, -1, 2, 1});
  }
}
