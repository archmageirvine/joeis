package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077970.
 * @author Sean A. Irvine
 */
public class A077970 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077970() {
    super(new long[] {-2, 2, -1}, new long[] {1, -1, 3});
  }
}
