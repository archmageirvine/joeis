package irvine.oeis.a113;

import irvine.oeis.FiniteSequence;

/**
 * A113886 Finite recursive sequence with <code>a(n) = a(a(n-2)) + a(n-a(n-1))</code>.
 * @author Georg Fischer
 */
public class A113886 extends FiniteSequence {

  /** Construct the sequence. */
  public A113886() {
    super(1, 1, 2, 2, 4, 3, 6, 3, 9, 3, 6, 5, 9, 7, 6, 6, 12, 9, 12, 6, 15, 12, 12, 14, 15, 12, 12, 15, 16, 13, 21, 13, 18, 13, 24, 12, 30, 12, 33, 15, 25, 18, 27, 24, 30, 21, 33, 18, 34, 18, 42, 15, 39, 12, 42, 16, 52, 15, 63);
  }
}
