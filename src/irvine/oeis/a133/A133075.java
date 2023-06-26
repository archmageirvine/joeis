package irvine.oeis.a133;

import irvine.oeis.FiniteSequence;

/**
 * A133075 Divisors of 2000.
 * @author Georg Fischer
 */
public class A133075 extends FiniteSequence {

  /** Construct the sequence. */
  public A133075() {
    super(1, FINITE, 1, 2, 4, 5, 8, 10, 16, 20, 25, 40, 50, 80, 100, 125, 200, 250, 400, 500, 1000, 2000);
  }
}
