package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077242.
 * @author Sean A. Irvine
 */
public class A077242 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077242() {
    super(new long[] {-1, 0, 6, 0}, new long[] {5, 7, 23, 37});
  }
}
