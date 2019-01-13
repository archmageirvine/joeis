package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047591.
 * @author Sean A. Irvine
 */
public class A047591 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047591() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 6, 7, 9});
  }
}
