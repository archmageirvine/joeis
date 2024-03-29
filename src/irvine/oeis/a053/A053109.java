package irvine.oeis.a053;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A053109 Expansion of 1/(1-10*x)^10.
 * @author Georg Fischer
 */
public class A053109 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A053109() {
    super(0, new long[] {1},
      new long[] {1, -100, 4500, -120000, 2100000, -25200000, 210000000, -1200000000L, 
      4500000000L, -10000000000L, 10000000000L});
  }
}
