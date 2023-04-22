package irvine.oeis.a307;

import irvine.oeis.Conjectural;
import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A307270 Coordination sequence for trivalent node of type alpha''' in the first Moore pentagonal tiling.
 * @author Georg Fischer
 */
public class A307270 extends HolonomicRecurrence implements Conjectural {


  /** Construct the sequence. */
  public A307270() {
    super(0, "[[0],[1],[0],[0],[0],[-2],[0],[0],[0],[1]]", "[1, 3, 6, 9, 13, 18, 27, 31, 34, 41, 50, 58, 61, 64, 75, 81, 82, 85]", 0);
  }
}
