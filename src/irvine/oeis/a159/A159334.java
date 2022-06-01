package irvine.oeis.a159;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A159334 Transform of A056594 by the T_{1,1} transformation (see link).
 * @author Sean A. Irvine
 */
public class A159334 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159334() {
    super(new long[] {1, -2, 4, -3, 3}, new long[] {2, 4, 9, 23, 55});
  }
}
