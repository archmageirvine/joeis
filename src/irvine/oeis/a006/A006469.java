package irvine.oeis.a006;

import irvine.oeis.LinearRecurrence;

/**
 * A006469 Number of rooted genus-1 maps with 2 faces, n vertices and no isthmuses.
 * @author Sean A. Irvine
 */
public class A006469 extends LinearRecurrence {

  /** Construct the sequence. */
  public A006469() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {10, 79, 340, 1071, 2772, 6258, 12768});
  }
}
