package irvine.oeis.a251;

import irvine.oeis.LinearRecurrence;

/**
 * A251765.
 * @author Sean A. Irvine
 */
public class A251765 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251765() {
    super(new long[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, new long[] {0, 0, 1, 0, 0, 0, 0, 0, 0, 0});
  }
}
