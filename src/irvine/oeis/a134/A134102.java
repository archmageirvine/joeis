package irvine.oeis.a134;

import irvine.oeis.FiniteSequence;

/**
 * A134102 Complete list of solutions to <code>y^2 = x^3 + 225;</code> sequence gives y values.
 * @author Georg Fischer
 */
public class A134102 extends FiniteSequence {

  /** Construct the sequence. */
  public A134102() {
    super(3, 10, 15, 17, 21, 35, 60, 165, 465, 2415, 6159, 6576, 611085363L);
  }
}
