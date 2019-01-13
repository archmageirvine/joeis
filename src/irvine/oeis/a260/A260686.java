package irvine.oeis.a260;

import irvine.oeis.LinearRecurrence;

/**
 * A260686.
 * @author Sean A. Irvine
 */
public class A260686 extends LinearRecurrence {

  /** Construct the sequence. */
  public A260686() {
    super(new long[] {1, -1, 0, 1}, new long[] {0, 1, 2, 3});
  }
}
