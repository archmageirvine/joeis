package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047271.
 * @author Sean A. Irvine
 */
public class A047271 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047271() {
    super(new long[] {-1, 1, 0, 1}, new long[] {0, 3, 5, 6});
  }
}
