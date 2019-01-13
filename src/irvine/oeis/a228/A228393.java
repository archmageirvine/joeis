package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228393.
 * @author Sean A. Irvine
 */
public class A228393 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228393() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {1, 2, 6, 24, 120, 675, 3527, 15484, 56917, 179719});
  }
}
