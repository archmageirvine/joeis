package irvine.oeis.a112;

import irvine.oeis.FiniteSequence;

/**
 * A112024 Number of cents in U.S. currency in 2005.
 * @author Georg Fischer
 */
public class A112024 extends FiniteSequence {

  /** Construct the sequence. */
  public A112024() {
    super(1, FINITE, 1, 5, 10, 25, 50, 100, 200, 500, 1000, 2000, 5000, 10000);
  }
}
