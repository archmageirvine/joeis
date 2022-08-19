package irvine.oeis.a005;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A005770 Number of convex polygons of length 2n on square lattice whose leftmost bottom vertex and rightmost top vertex have the same x-coordinate.
 * @author Georg Fischer
 */
public class A005770 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A005770() {
    super(5, "[0, 8,-54, 125,-120, 55,-12, 1]", "[1, 9, 55, 286]", 0);
  }
}
