package irvine.oeis.a109;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A109124 a(n) = (n+1)*(n+2)^3*(n+3)^4*(n+4)^3*(n+5)*(2n+5)*(2n+7)/7257600.
 * @author Georg Fischer
 */
public class A109124 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A109124() {
    super(0, new long[] {1, 75, 1230, 6905, 15813, 15813, 6905, 1230, 75, 1},
      new long[] {1, -15, 105, -455, 1365, -3003, 5005, -6435, 6435, -5005, 3003, 
      -1365, 455, -105, 15, -1});
  }
}
