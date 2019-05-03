package irvine.oeis.a182;

import irvine.oeis.LinearRecurrence;

/**
 * A182895 Number of <code>(1,0)-steps</code> at level 0 in all weighted lattice paths in <code>L_n</code>.
 * @author Sean A. Irvine
 */
public class A182895 extends LinearRecurrence {

  /** Construct the sequence. */
  public A182895() {
    super(new long[] {-1, 2, 1, 2}, new long[] {0, 1, 3, 7});
  }
}
