package irvine.oeis.a140;
// manually deris/essent at 2022-04-28 12:39

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A140662 Number of possible column states for self-avoiding polygons in a slit of width n.
 * @author Georg Fischer
 */
public class A140662 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A140662() {
    super(1, "[[0],[6,-3],[-5, 4],[3, 2],[-7,-4],[3, 1]]", "1", 0);
  }
}
