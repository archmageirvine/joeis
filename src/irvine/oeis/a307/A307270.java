package irvine.oeis.a307;

import irvine.oeis.HolonomicRecurrence;

/**
 * A307270 Coordination sequence for trivalent node of type alpha&apos;&apos;&apos; in the first Moore pentagonal tiling.
 * @author Georg Fischer
 */
public class A307270 extends HolonomicRecurrence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A307270() {
    super(1, "[[0],[1],[0],[0],[0],[-2],[0],[0],[0],[1]]", "[1, 3, 6, 9, 13, 18, 27, 31, 34, 41, 50, 58, 61, 64, 75, 81, 82, 85]", 0);
  }
}
