package irvine.oeis.a159;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A159350 Transform of A056594 by the T_{0,0} transformation (see link).
 * @author Sean A. Irvine
 */
public class A159350 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159350() {
    super(new long[] {1, -2, 4, -3, 3}, new long[] {1, 1, 1, 4, 11});
  }
}
