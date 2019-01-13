package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131246.
 * @author Sean A. Irvine
 */
public class A131246 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131246() {
    super(new long[] {-1, -1, 3, 1}, new long[] {1, 3, 6, 13});
  }
}
