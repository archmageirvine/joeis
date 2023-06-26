package irvine.oeis.a133;

import irvine.oeis.FiniteSequence;

/**
 * A133020 Divisors of 10000.
 * @author Georg Fischer
 */
public class A133020 extends FiniteSequence {

  /** Construct the sequence. */
  public A133020() {
    super(1, FINITE, 1, 2, 4, 5, 8, 10, 16, 20, 25, 40, 50, 80, 100, 125, 200, 250, 400, 500, 625, 1000, 1250, 2000, 2500, 5000, 10000);
  }
}
