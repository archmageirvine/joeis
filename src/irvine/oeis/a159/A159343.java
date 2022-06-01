package irvine.oeis.a159;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A159343 Transform of A056594 by the T_{0,1} transformation (see link).
 * @author Sean A. Irvine
 */
public class A159343 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159343() {
    super(new long[] {1, -2, 4, -3, 3}, new long[] {2, 3, 6, 16, 39});
  }
}
