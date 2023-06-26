package irvine.oeis.a129;

import irvine.oeis.FiniteSequence;

/**
 * A129068 A128894[n,k] for k=1 : Coxeter numbers as defined by Bulgadaev for exceptional group sequence using critical exponent solution.
 * @author Georg Fischer
 */
public class A129068 extends FiniteSequence {

  /** Construct the sequence. */
  public A129068() {
    super(1, FINITE, 2, 3, 3, 6, 9, 12, 18, 24, 30, 50);
  }
}
