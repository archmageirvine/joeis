package irvine.oeis.a124;

import irvine.oeis.FiniteSequence;

/**
 * A124146 U.S.A. currency denominations in dollars.
 * @author Georg Fischer
 */
public class A124146 extends FiniteSequence {

  /** Construct the sequence. */
  public A124146() {
    super(1, 2, 5, 10, 20, 50, 100, 500, 1000, 5000, 10000, 100000);
  }
}
