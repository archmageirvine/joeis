package irvine.oeis.a260;

import irvine.oeis.LinearRecurrence;

/**
 * A260917.
 * @author Sean A. Irvine
 */
public class A260917 extends LinearRecurrence {

  /** Construct the sequence. */
  public A260917() {
    super(new long[] {-1, -1, 0, 0, 1, 1, 1}, new long[] {1, 1, 2, 4, 7, 13, 23});
  }
}
