package irvine.oeis.a226;

import irvine.oeis.FiniteSequence;

/**
 * A226465 Numbers n = x0 x1...x9 such that sum of digits (mod 10) - xi == i+1 mod 10.
 * @author Georg Fischer
 */
public class A226465 extends FiniteSequence {

  /** Construct the sequence. */
  public A226465() {
    super(21, 210, 765, 9876, 2109876, 7654321, 76543210, 4321098765L);
  }
}
