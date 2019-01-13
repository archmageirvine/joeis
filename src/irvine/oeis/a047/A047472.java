package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047472.
 * @author Sean A. Irvine
 */
public class A047472 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047472() {
    super(new long[] {-1, 1, 0, 1}, new long[] {0, 1, 3, 8});
  }
}
