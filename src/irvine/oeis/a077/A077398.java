package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077398.
 * @author Sean A. Irvine
 */
public class A077398 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077398() {
    super(new long[] {1, -1, -16, 16, 1}, new long[] {0, 2, 5, 39, 87});
  }
}
