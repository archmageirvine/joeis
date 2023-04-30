package irvine.oeis.a308;
// manually verified, 2023-04-29 (Spezia)

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A308123 Sum of the perimeters of all integer-sided isosceles triangles with perimeter n.
 * @author Georg Fischer
 */
public class A308123 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A308123() {
    super(1, "[[0],[-1],[1],[0],[0],[2],[-2],[0],[0],[-1],[1]]", "0,0,3,0,5,6,14,8,18,20", 0);
  }
}
