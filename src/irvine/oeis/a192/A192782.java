package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192782.
 * @author Sean A. Irvine
 */
public class A192782 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192782() {
    super(new long[] {1, 1, -3, -1, 3, 1}, new long[] {0, 0, 1, 1, 4, 6});
  }
}
