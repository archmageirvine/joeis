package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094328.
 * @author Sean A. Irvine
 */
public class A094328 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094328() {
    super(new long[] {1, 0, 0, 0, 0}, new long[] {4, 5, 7, 9, 6});
  }
}
