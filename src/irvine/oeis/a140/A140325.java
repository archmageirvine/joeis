package irvine.oeis.a140;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A140325 a(n) = binomial(n+8,8) * 2^n.
 * @author Georg Fischer
 */
public class A140325 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A140325() {
    super(0, new long[] {1},
      new long[] {1, -18, 144, -672, 2016, -4032, 5376, -4608, 2304, -512});
  }
}
