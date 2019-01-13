package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192813.
 * @author Sean A. Irvine
 */
public class A192813 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192813() {
    super(new long[] {-1, 0, -1, 0, 0, 2}, new long[] {0, 1, 1, 3, 4, 6});
  }
}
