package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157651.
 * @author Sean A. Irvine
 */
public class A157651 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157651() {
    super(new long[] {1, -3, 3}, new long[] {57, 308, 759});
  }
}
