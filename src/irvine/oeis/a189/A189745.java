package irvine.oeis.a189;

import irvine.oeis.LinearRecurrence;

/**
 * A189745.
 * @author Sean A. Irvine
 */
public class A189745 extends LinearRecurrence {

  /** Construct the sequence. */
  public A189745() {
    super(new long[] {1, 5}, new long[] {5, 1});
  }
}
