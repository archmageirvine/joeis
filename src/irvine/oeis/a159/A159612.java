package irvine.oeis.a159;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A159612 INVERT transform of (1, 3, 1, 3, 1, ...).
 * @author Sean A. Irvine
 */
public class A159612 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159612() {
    super(new long[] {4, 1}, new long[] {1, 4});
  }
}
