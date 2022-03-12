package irvine.oeis.a307;

import irvine.oeis.HolonomicRecurrence;

/**
 * A307203 Coordination sequence for trivalent node of type alpha&apos;&apos; in the first Moore pentagonal tiling.
 * @author Georg Fischer
 */
public class A307203 extends HolonomicRecurrence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A307203() {
    super(1, "[[0],[1],[0],[0],[0],[-2],[0],[0],[0],[1]]", "[1, 3, 7, 10, 14, 21, 26, 32, 38, 46, 51, 56, 61, 71, 73, 78, 84, 94]", 0);
  }
}
