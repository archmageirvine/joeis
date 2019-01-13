package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024862.
 * @author Sean A. Irvine
 */
public class A024862 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024862() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {3, 5, 17, 23, 50, 62, 110});
  }
}
