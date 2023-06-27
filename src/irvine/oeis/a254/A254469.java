package irvine.oeis.a254;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A254469 Sixth partial sums of cubes (A000578).
 * @author Sean A. Irvine
 */
public class A254469 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254469() {
    super(1, new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {1, 14, 96, 450, 1650, 5082, 13728, 33462, 75075, 157300});
  }
}
