package irvine.oeis.a215;

import irvine.oeis.FiniteSequence;

/**
 * A215558 Cubes whose final digit or final two digits are the cube root.
 * @author Georg Fischer
 */
public class A215558 extends FiniteSequence {

  /** Construct the sequence. */
  public A215558() {
    super(0, 1, 64, 125, 216, 729, 13824, 15625, 117649, 132651, 421875, 438976, 970299);
  }
}
