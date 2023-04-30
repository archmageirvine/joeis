package irvine.oeis.a307;
// manually verified, 2023-04-29

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A307201 Coordination sequence for trivalent node of type alpha in the first Moore pentagonal tiling.
 * @author Georg Fischer
 */
public class A307201 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A307201() {
    super(0, "[[0],[1],[0],[0],[0],[-2],[0],[0],[0],[1]]", "1,3,9,12,21,30,30,33,42", 0);
  }
}
