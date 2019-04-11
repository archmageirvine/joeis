package irvine.oeis.a162;

import irvine.oeis.FiniteSequence;

/**
 * A162692 Strictly positive numbers n such that <code>28*n/(28+n)</code> are integers.
 * @author Georg Fischer
 */
public class A162692 extends FiniteSequence {

  /** Construct the sequence. */
  public A162692() {
    super(21, 28, 70, 84, 168, 364, 756);
  }
}
