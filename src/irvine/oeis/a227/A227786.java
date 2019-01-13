package irvine.oeis.a227;

import irvine.oeis.LinearRecurrence;

/**
 * A227786.
 * @author Sean A. Irvine
 */
public class A227786 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227786() {
    super(new long[] {1, -2, 0, 2}, new long[] {1, 7, 13, 23});
  }
}
