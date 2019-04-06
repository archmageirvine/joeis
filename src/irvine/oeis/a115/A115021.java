package irvine.oeis.a115;

import irvine.oeis.FiniteSequence;

/**
 * A115021 Numbers typed on a keyboard's numeric keypad: start at 1 and read alternately up and down until reaching 9.
 * @author Georg Fischer
 */
public class A115021 extends FiniteSequence {

  /** Construct the sequence. */
  public A115021() {
    super(1, 4, 7, 8, 5, 2, 3, 6, 9);
  }
}
