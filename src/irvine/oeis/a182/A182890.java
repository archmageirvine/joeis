package irvine.oeis.a182;

import irvine.oeis.LinearRecurrence;

/**
 * A182890 Number of <code>(1</code>,0)-steps of weight 1 at level 0 in all weighted lattice paths in L_n.
 * @author Sean A. Irvine
 */
public class A182890 extends LinearRecurrence {

  /** Construct the sequence. */
  public A182890() {
    super(new long[] {-1, 2, 1, 2}, new long[] {0, 1, 2, 5});
  }
}
