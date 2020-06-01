package irvine.oeis.a298;

import irvine.oeis.FiniteSequence;

/**
 * A298809 Growth series for group with presentation <code>&lt;</code> S, T : <code>S^2 = T^3 = (S*T)^5 = 1 &gt;</code>.
 * @author Georg Fischer
 */
public class A298809 extends FiniteSequence {

  /** Construct the sequence. */
  public A298809() {
    super(1, 3, 4, 6, 8, 10, 8, 10, 6, 3, 1);
  }
}
