package irvine.oeis.a122;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A122597 a(0) = 1, a(1) = 2, s = 1; for n &gt;= 2, if a(n-1) is even and s = 0 then set a(n) = a(n-1)/2 and s = 1; otherwise set a(n) = a(n-1) + a(n-2) and s = 0.
 * @author Georg Fischer
 */
public class A122597 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A122597() {
    super(0, new long[] {-1, -2, -3, -5, -8, -1, -6, 3, -3, 15, -15},
      new long[] {-1, 0, 0, 0, 0, 3});
  }
}
