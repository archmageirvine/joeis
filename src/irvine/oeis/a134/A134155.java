package irvine.oeis.a134;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A134155 a(n) = 1 + 21 n + 168 n^2 + 588 n^3 + 1029 n^4.
 * @author Georg Fischer
 */
public class A134155 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A134155() {
    super(0, new long[] {-1, -1802, -12858, -9446, -589},
      new long[] {-1, 5, -10, 10, -5, 1});
  }
}
