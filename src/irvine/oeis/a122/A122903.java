package irvine.oeis.a122;

import irvine.oeis.FiniteSequence;

/**
 * A122903 Numbers n such that in Z/nZ the number of squares is equal to the number of invertible elements.
 * @author Georg Fischer
 */
public class A122903 extends FiniteSequence {

  /** Construct the sequence. */
  public A122903() {
    super(1, 3, 4, 12, 70, 90, 210);
  }
}
