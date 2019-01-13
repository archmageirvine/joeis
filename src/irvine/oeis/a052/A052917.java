package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052917.
 * @author Sean A. Irvine
 */
public class A052917 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052917() {
    super(new long[] {1, 0, 0, 3}, new long[] {1, 3, 9, 27});
  }
}
