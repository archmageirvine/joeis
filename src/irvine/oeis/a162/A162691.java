package irvine.oeis.a162;

import irvine.oeis.FiniteSequence;

/**
 * A162691 Strictly positive numbers n such that 24*n/(24+n) is an integer.
 * @author Georg Fischer
 */
public class A162691 extends FiniteSequence {

  /** Construct the sequence. */
  public A162691() {
    super(8, 12, 24, 40, 48, 72, 120, 168, 264, 552);
  }
}
