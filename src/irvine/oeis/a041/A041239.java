package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041239 Denominators of continued fraction convergents to <code>sqrt(131)</code>.
 * @author Sean A. Irvine
 */
public class A041239 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041239() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 21220, 0, 0, 0, 0, 0}, new long[] {1, 2, 9, 101, 413, 927, 20807, 42541, 190971, 2143222, 8763859, 19670940});
  }
}
