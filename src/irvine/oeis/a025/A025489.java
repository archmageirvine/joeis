package irvine.oeis.a025;

import irvine.oeis.FiniteSequence;

/**
 * A025489 Numbers on backgammon doubling cube.
 * @author Georg Fischer
 */
public class A025489 extends FiniteSequence {

  /** Construct the sequence. */
  public A025489() {
    super(2, 4, 8, 16, 32, 64);
  }
}
