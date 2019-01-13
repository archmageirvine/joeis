package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133648.
 * @author Sean A. Irvine
 */
public class A133648 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133648() {
    super(new long[] {3, -7, 5}, new long[] {5, 18, 59});
  }
}
