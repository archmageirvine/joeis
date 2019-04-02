package irvine.oeis.a244;

import irvine.oeis.LinearRecurrence;

/**
 * A244874 Number of magic labelings with magic sum n of 6th graph shown in link.
 * @author Sean A. Irvine
 */
public class A244874 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244874() {
    super(new long[] {-1, 7, -20, 28, -14, -14, 28, -20, 7}, new long[] {1, 17, 137, 707, 2709, 8417, 22408, 53008, 114251});
  }
}
