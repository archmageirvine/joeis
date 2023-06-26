package irvine.oeis.a094;

import irvine.oeis.FiniteSequence;

/**
 * A094209 Numbers n such that the sum of n's digits times the sum of the factorials of n's digits is equal to n.
 * @author Georg Fischer
 */
public class A094209 extends FiniteSequence {

  /** Construct the sequence. */
  public A094209() {
    super(1, FINITE, 1, 224, 441, 21660, 26406);
  }
}
