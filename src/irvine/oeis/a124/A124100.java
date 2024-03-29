package irvine.oeis.a124;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A124100 Sum_(x^i*y^j*z^k) with i + j + k = m and (x, y, z) = the primitive Pythagorean triple (8, 15, 17).
 * @author Georg Fischer
 */
public class A124100 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A124100() {
    super(0, new long[] {1},
      new long[] {1, -40, 511, -2040});
  }
}
