package irvine.oeis.a094;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A094257 Let M be the 3 X 3 matrix [0 1 0 / 0 0 1 / 7 -35 21]. Take M^n * [1 1 1] = [p q r]; then a(n-1), a(n), a(n+1) = -p, -q, -r respectively.
 * @author Georg Fischer
 */
public class A094257 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A094257() {
    super(1, new long[] {0, -1, 14, -63, 14},
      new long[] {-1, 21, -35, 7});
  }
}
