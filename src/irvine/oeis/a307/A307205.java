package irvine.oeis.a307;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A307205 Coordination sequence for tetravalent node in the first Moore pentagonal tiling.
 * @author Georg Fischer
 */
public class A307205 extends HolonomicRecurrence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A307205() {
    super(0, "[[0],[1],[0],[0],[0],[-2],[0],[0],[0],[1]]", "[1, 4, 8, 14, 19, 24, 29, 36, 44, 48, 54, 58, 69, 68, 77]", 0);
  }
}
