package irvine.oeis.a182;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A182904 Number of weighted lattice paths in L_n having no peaks. The members of L_n are paths of weight n that start at (0,0), end on the horizontal axis and whose steps are of the following four kinds: an (1,0)-step with weight 1, an (1,0)-step with weight 2, a (1,1)-step with weight 2, and a (1,-1)-step with weight 1. The weight of a path is the sum of the weights of its steps. A peak is a (1,1)-step followed by a (1,-1)-step.
 * @author Georg Fischer
 */
public class A182904 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A182904() {
    super(0, "[[0],[-3,1],[5,-2],[2,-1],[0],[1,-1],[1,-2],[0,1]]", "1,1,2", 0);
  }
}
