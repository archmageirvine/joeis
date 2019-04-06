package irvine.oeis.a271;

import irvine.oeis.FiniteSequence;

/**
 * A271876 Numbers n such that 3^n is not of the form x^3 + y^3 + z^3 where x, y, z &gt; 0.
 * @author Georg Fischer
 */
public class A271876 extends FiniteSequence {

  /** Construct the sequence. */
  public A271876() {
    super(0, 2, 3, 5, 8, 11, 14, 17, 20);
  }
}
