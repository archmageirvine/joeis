package irvine.oeis.a109;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A109106 a(n) = (1/sqrt(5))*((sqrt(5) + 1)*((15 + 5*sqrt(5))/2)^(n-1) + (sqrt(5) - 1)*((15 - 5*sqrt(5))/2)^(n-1)).
 * @author Georg Fischer
 */
public class A109106 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A109106() {
    super(1, new long[] {0, 2, -10},
      new long[] {1, -15, 25});
  }
}
