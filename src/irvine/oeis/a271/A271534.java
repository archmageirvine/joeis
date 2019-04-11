package irvine.oeis.a271;

import irvine.oeis.FiniteSequence;

/**
 * A271534 Numbers n with digits abc..xyz such that <code>n = (a + b +</code> c <code>+ ... + x +</code> y + z) <code>+ (a^b +</code> b^c + c^d <code>+ ... +</code> x^y + y^z).
 * @author Georg Fischer
 */
public class A271534 extends FiniteSequence {

  /** Construct the sequence. */
  public A271534() {
    super(1, 2, 3, 4, 5, 6, 7, 8, 9, 33, 92, 1683552);
  }
}
