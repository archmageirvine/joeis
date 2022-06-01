package irvine.oeis.a159;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A159339 Transform of A056594 by the T_{1,0} transformation (see link).
 * @author Sean A. Irvine
 */
public class A159339 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159339() {
    super(new long[] {1, -2, 4, -3, 3}, new long[] {1, 2, 4, 11, 27});
  }
}
