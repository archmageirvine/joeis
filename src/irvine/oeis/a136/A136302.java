package irvine.oeis.a136;

import irvine.oeis.LinearRecurrence;

/**
 * A136302.
 * @author Sean A. Irvine
 */
public class A136302 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136302() {
    super(new long[] {1, -2, 3}, new long[] {2, 6, 15});
  }
}
