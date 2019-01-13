package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228577.
 * @author Sean A. Irvine
 */
public class A228577 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228577() {
    super(new long[] {-1, -2, -1, 2, 2, 0}, new long[] {0, 1, 0, 2, 2, 3});
  }
}
