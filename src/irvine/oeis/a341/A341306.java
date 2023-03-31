package irvine.oeis.a341;

import irvine.oeis.SkipSequence;
import irvine.oeis.a004.A004016;
import irvine.oeis.transform.RootSequence;

/**
 * A341306 Fourier coefficients of the modular form F_{3A}^8.
 * @author Georg Fischer
 */
public class A341306 extends RootSequence {

  /** Construct the sequence. */
  public A341306() {
    super(0, new SkipSequence(new A004016(), 1), 8, 1);
  }
}
