package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052915.
 * @author Sean A. Irvine
 */
public class A052915 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052915() {
    super(new long[] {-3, 3, 1, 1}, new long[] {1, 0, 1, 4});
  }
}
