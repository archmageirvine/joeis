package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016853.
 * @author Sean A. Irvine
 */
public class A016853 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016853() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 3125, 100000, 759375, 3200000, 9765625});
  }
}
