package irvine.oeis.a248;

import irvine.oeis.FiniteSequence;

/**
 * A248888 Numbers k such that prime(k) &lt;= 2*sigma(k).
 * @author Georg Fischer
 */
public class A248888 extends FiniteSequence {

  /** Construct the sequence. */
  public A248888() {
    super(1, FINITE, 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 14, 15, 16, 18, 20, 24, 28, 30, 36, 40, 42, 48, 60, 72, 84, 90, 96, 120, 180);
  }
}
