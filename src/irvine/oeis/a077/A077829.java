package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077829.
 * @author Sean A. Irvine
 */
public class A077829 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077829() {
    super(new long[] {2, 3, 3}, new long[] {1, 3, 12});
  }
}
