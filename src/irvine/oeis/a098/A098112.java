package irvine.oeis.a098;

import irvine.oeis.FiniteSequence;

/**
 * A098112 Number of different colorings of the platonic solids allowing rotation symmetry.
 * @author Georg Fischer
 */
public class A098112 extends FiniteSequence {

  /** Construct the sequence. */
  public A098112() {
    super(1, FINITE, 5, 10, 23, 96, 17824);
  }
}
