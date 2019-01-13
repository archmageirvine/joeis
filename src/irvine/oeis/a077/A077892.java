package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077892.
 * @author Sean A. Irvine
 */
public class A077892 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077892() {
    super(new long[] {-1, 3, -2, 1}, new long[] {1, 1, -1, 0});
  }
}
