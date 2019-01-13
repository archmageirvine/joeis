package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047414.
 * @author Sean A. Irvine
 */
public class A047414 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047414() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 3, 4, 6, 8});
  }
}
