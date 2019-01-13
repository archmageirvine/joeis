package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192805.
 * @author Sean A. Irvine
 */
public class A192805 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192805() {
    super(new long[] {-1, -1, 1, 2}, new long[] {1, 1, 1, 2});
  }
}
