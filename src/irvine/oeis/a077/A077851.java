package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077851.
 * @author Sean A. Irvine
 */
public class A077851 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077851() {
    super(new long[] {-2, 2, -2, 3}, new long[] {1, 3, 7, 17});
  }
}
