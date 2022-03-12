package irvine.oeis.a307;

import irvine.oeis.HolonomicRecurrence;

/**
 * A307204 Coordination sequence for trivalent node of type alpha&quot;&quot; in the first Moore pentagonal tiling.
 * @author Georg Fischer
 */
public class A307204 extends HolonomicRecurrence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A307204() {
    super(1, "[[0],[1],[0],[0],[0],[-2],[0],[0],[0],[1]]", "[1, 3, 6, 6, 12, 18, 24, 30, 30, 33, 48, 57, 60, 60, 72, 84, 78, 81]", 0);
  }
}
