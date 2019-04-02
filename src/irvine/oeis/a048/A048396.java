package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048396 Sums of consecutive noncubes.
 * @author Sean A. Irvine
 */
public class A048396 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048396() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 27, 315, 1638, 5670, 15345});
  }
}
