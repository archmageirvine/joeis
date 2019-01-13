package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048745.
 * @author Sean A. Irvine
 */
public class A048745 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048745() {
    super(new long[] {-1, -1, 3}, new long[] {1, 5, 14});
  }
}
