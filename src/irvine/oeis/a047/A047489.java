package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047489.
 * @author Sean A. Irvine
 */
public class A047489 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047489() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {1, 2, 3, 5, 7, 9});
  }
}
