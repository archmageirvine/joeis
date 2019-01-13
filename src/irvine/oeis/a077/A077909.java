package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077909.
 * @author Sean A. Irvine
 */
public class A077909 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077909() {
    super(new long[] {2, -1, 0, 0}, new long[] {1, 0, 0, -1});
  }
}
