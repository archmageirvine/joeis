package irvine.oeis.a307;

import irvine.oeis.FiniteSequence;

/**
 * A307345 Numbers k such that every prime p &lt;= sqrt(k) divides k*(k-1).
 * @author Georg Fischer
 */
public class A307345 extends FiniteSequence {

  /** Construct the sequence. */
  public A307345() {
    super(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 15, 16, 18, 19, 21, 22, 24, 25, 30, 31, 36, 40, 45, 46, 70, 85, 91, 105, 106, 120);
  }
}
