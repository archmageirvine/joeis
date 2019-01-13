package irvine.oeis.a136;

import irvine.oeis.LinearRecurrence;

/**
 * A136210.
 * @author Sean A. Irvine
 */
public class A136210 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136210() {
    super(new long[] {-1, 0, 5, 0}, new long[] {1, 3, 4, 15});
  }
}
