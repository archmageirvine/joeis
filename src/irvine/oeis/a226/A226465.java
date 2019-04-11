package irvine.oeis.a226;

import irvine.oeis.FiniteSequence;

/**
 * A226465 Numbers <code>n = x0 x1...x9</code> such that sum of digits <code>(mod 10) -</code> xi <code>==</code> i+1 <code>mod 10</code>.
 * @author Georg Fischer
 */
public class A226465 extends FiniteSequence {

  /** Construct the sequence. */
  public A226465() {
    super(21, 210, 765, 9876, 2109876, 7654321, 76543210, 4321098765L);
  }
}
