package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168232 a(n) = (2*n - 3*(-1)^n - 1)/2.
 * @author Sean A. Irvine
 */
public class A168232 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168232() {
    super(new long[] {-1, 1, 1}, new long[] {2, 0, 4});
  }
}
