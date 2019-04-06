package irvine.oeis.a046;

import irvine.oeis.FiniteSequence;

/**
 * A046459 Dudeney numbers: integers equal to the sum of the digits of their cubes.
 * @author Georg Fischer
 */
public class A046459 extends FiniteSequence {

  /** Construct the sequence. */
  public A046459() {
    super(0, 1, 8, 17, 18, 26, 27);
  }
}
