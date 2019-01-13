package irvine.oeis.a064;

import irvine.oeis.LinearRecurrence;

/**
 * A064694.
 * @author Sean A. Irvine
 */
public class A064694 extends LinearRecurrence {

  /** Construct the sequence. */
  public A064694() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {1, 5, 10, 22, 34, 58, 80});
  }
}
