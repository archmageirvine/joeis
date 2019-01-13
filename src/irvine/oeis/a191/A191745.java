package irvine.oeis.a191;

import irvine.oeis.LinearRecurrence;

/**
 * A191745.
 * @author Sean A. Irvine
 */
public class A191745 extends LinearRecurrence {

  /** Construct the sequence. */
  public A191745() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 23, 136, 411});
  }
}
