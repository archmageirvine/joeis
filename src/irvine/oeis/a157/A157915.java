package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157915.
 * @author Sean A. Irvine
 */
public class A157915 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157915() {
    super(new long[] {1, -3, 3}, new long[] {650, 2525, 5650});
  }
}
