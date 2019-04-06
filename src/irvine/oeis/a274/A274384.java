package irvine.oeis.a274;

import irvine.oeis.FiniteSequence;

/**
 * A274384 Numbers n such that 2^n is not the average of three positive cubes.
 * @author Georg Fischer
 */
public class A274384 extends FiniteSequence {

  /** Construct the sequence. */
  public A274384() {
    super(1, 2, 4, 5, 7, 8, 10, 11, 13, 14, 16, 17, 19, 20, 22, 23, 25, 26, 28, 29, 31, 32, 34, 37, 40, 43, 46);
  }
}
