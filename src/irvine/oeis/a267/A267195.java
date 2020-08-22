package irvine.oeis.a267;

import irvine.oeis.FiniteSequence;

/**
 * A267195 The j-invariants in A032354 are perfect cubes, except for two terms that have an extra factor of 2 or 3. Ignore these two extra factors and take the cube roots.
 * @author Georg Fischer
 */
public class A267195 extends FiniteSequence {

  /** Construct the sequence. */
  public A267195() {
    super(0, 12, -15, 20, -32, 30, 66, -96, -160, 255, -960, -5280, -640320);
  }
}
