package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192779.
 * @author Sean A. Irvine
 */
public class A192779 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192779() {
    super(new long[] {1, 1, -6, -1, 6, 1}, new long[] {0, 0, 1, 1, 7, 12});
  }
}
