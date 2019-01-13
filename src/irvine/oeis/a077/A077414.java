package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077414.
 * @author Sean A. Irvine
 */
public class A077414 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077414() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 4, 15, 36});
  }
}
