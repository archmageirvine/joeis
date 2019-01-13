package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077903.
 * @author Sean A. Irvine
 */
public class A077903 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077903() {
    super(new long[] {2, -3, 2, 0}, new long[] {1, 0, 2, -3});
  }
}
