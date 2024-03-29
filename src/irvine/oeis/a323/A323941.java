package irvine.oeis.a323;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A323941 Total number of isomers (nonisomorphic systems) of unbranched tri-4-catafusenes as a function of the number of hexagons (see Cyvin et al. (1996) for precise definition).
 * @author Georg Fischer
 */
public class A323941 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A323941() {
    super(3, "[0, 729,-3888, 8262,-8208, 2223, 3168,-3372, 1056, 247,-304, 102,-16, 1]", "[1, 3, 16, 62, 275, 1121, 4584, 18012, 69573, 262495, 974704, 3562714]", 0);
  }
}
