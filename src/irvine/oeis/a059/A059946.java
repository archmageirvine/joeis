package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059946.
 * @author Sean A. Irvine
 */
public class A059946 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059946() {
    super(new long[] {-1440, 3384, -2924, 1210, -255, 26}, new long[] {0, 0, 0, 25, 472, 6185});
  }
}
