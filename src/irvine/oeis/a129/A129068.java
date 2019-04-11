package irvine.oeis.a129;

import irvine.oeis.FiniteSequence;

/**
 * A129068 A128894[n,k] for <code>k=1 </code>: Coxeter numbers as defined by Bulgadaev for exceptional group sequence using critical exponent solution.
 * @author Georg Fischer
 */
public class A129068 extends FiniteSequence {

  /** Construct the sequence. */
  public A129068() {
    super(2, 3, 3, 6, 9, 12, 18, 24, 30, 50);
  }
}
