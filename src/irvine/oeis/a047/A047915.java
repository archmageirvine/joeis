package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047915 3*n^2-2*n+6.
 * @author Sean A. Irvine
 */
public class A047915 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047915() {
    super(new long[] {1, -3, 3}, new long[] {6, 7, 14});
  }
}
