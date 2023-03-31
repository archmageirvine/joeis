package irvine.oeis.a341;

import irvine.oeis.SkipSequence;
import irvine.oeis.a008.A008655;
import irvine.oeis.transform.RootSequence;

/**
 * A341556 Fourier coefficients of the modular form F_{3A}^12.
 * @author Georg Fischer
 */
public class A341556 extends RootSequence {

  /** Construct the sequence. */
  public A341556() {
    super(0, new SkipSequence(new A008655(), 1), 3, 1);
  }
}
