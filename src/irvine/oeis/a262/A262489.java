package irvine.oeis.a262;

import irvine.oeis.LinearRecurrence;

/**
 * A262489.
 * @author Sean A. Irvine
 */
public class A262489 extends LinearRecurrence {

  /** Construct the sequence. */
  public A262489() {
    super(new long[] {1, -1, -10, 10, 1}, new long[] {7, 18, 78, 187, 781});
  }
}
