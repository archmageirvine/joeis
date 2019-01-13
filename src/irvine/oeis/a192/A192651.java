package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192651.
 * @author Sean A. Irvine
 */
public class A192651 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192651() {
    super(new long[] {1, 1, -4, -1, 4, 1}, new long[] {0, 0, 1, 1, 5, 8});
  }
}
