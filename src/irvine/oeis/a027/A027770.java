package irvine.oeis.a027;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A027770 a(n) = (n + 1)*binomial(n + 1, 10).
 * @author Georg Fischer
 */
public class A027770 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A027770() {
    super(9, new long[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 1},
      new long[] {1, -12, 66, -220, 495, -792, 924, -792, 495, -220, 66, -12, 1});
  }
}
