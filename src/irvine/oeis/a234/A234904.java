package irvine.oeis.a234;

import irvine.oeis.LinearRecurrence;

/**
 * A234904 a(n)*Pi is the total length of irregular spiral (center points: 2, 1, 3) after n rotations.
 * @author Sean A. Irvine
 */
public class A234904 extends LinearRecurrence {

  /** Construct the sequence. */
  public A234904() {
    super(new long[] {-1, 1, 0, 1}, new long[] {3, 12, 18, 21});
  }
}
