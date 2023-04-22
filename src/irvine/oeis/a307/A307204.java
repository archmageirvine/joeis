package irvine.oeis.a307;

import irvine.oeis.Conjectural;
import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A307204 Coordination sequence for trivalent node of type alpha'''' in the first Moore pentagonal tiling.
 * @author Georg Fischer
 */
public class A307204 extends HolonomicRecurrence implements Conjectural {


  /** Construct the sequence. */
  public A307204() {
    super(0, "[[0],[1],[0],[0],[0],[-2],[0],[0],[0],[1]]", "[1, 3, 6, 6, 12, 18, 24, 30, 30, 33, 48, 57, 60, 60, 72, 84, 78, 81]", 0);
  }
}
