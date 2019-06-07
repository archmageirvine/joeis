package irvine.oeis.a298;

import irvine.oeis.FiniteSequence;

/**
 * A298808 Growth series for group with presentation <code>&lt</code>; S, T : <code>S^2 = T^3 = (S*T)^4 = 1 &gt;</code>.
 * @author Georg Fischer
 */
public class A298808 extends FiniteSequence {

  /** Construct the sequence. */
  public A298808() {
    super(1, 3, 4, 6, 6, 3, 1);
  }
}
