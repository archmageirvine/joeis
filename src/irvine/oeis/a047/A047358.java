package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047358.
 * @author Sean A. Irvine
 */
public class A047358 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047358() {
    super(new long[] {-1, 1, 1}, new long[] {2, 3, 9});
  }
}
