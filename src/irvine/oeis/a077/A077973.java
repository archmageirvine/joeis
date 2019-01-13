package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077973.
 * @author Sean A. Irvine
 */
public class A077973 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077973() {
    super(new long[] {2, 0, -1}, new long[] {1, -1, 1});
  }
}
