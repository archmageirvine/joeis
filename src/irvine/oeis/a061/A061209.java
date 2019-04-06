package irvine.oeis.a061;

import irvine.oeis.FiniteSequence;

/**
 * A061209 Numbers which are the cubes of their digit sum.
 * @author Georg Fischer
 */
public class A061209 extends FiniteSequence {

  /** Construct the sequence. */
  public A061209() {
    super(0, 1, 512, 4913, 5832, 17576, 19683);
  }
}
