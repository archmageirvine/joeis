package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154560.
 * @author Sean A. Irvine
 */
public class A154560 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154560() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 9, 26, 55});
  }
}
