package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047587.
 * @author Sean A. Irvine
 */
public class A047587 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047587() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 1}, new long[] {0, 2, 3, 5, 6, 7, 8});
  }
}
