package irvine.oeis.a241;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A241452 a(n) = pg(3, n) + pg(4, n) + ... + pg(n, n) where pg(m, n) is the n-th m-th-order polygonal number.
 * @author Georg Fischer
 */
public class A241452 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A241452() {
    super(0, new long[] {0, 0, 0, -6, 4, -5, 1},
      new long[] {-1, 5, -10, 10, -5, 1});
  }
}
