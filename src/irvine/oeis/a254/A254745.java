package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254745.
 * @author Sean A. Irvine
 */
public class A254745 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254745() {
    super(new long[] {1, -2, 2}, new long[] {1, 3, 4});
  }
}
