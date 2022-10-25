package irvine.oeis.a182;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A182881 Number of (1,1)-steps in all weighted lattice paths in L_n.
 * @author Georg Fischer
 */
public class A182881 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A182881() {
    super(0, "[[0],[-1,1],[3,-2],[2,-1],[5,-2],[-3,1]]", "0,0,0,2", 0);
  }
}
