package irvine.oeis.a005;

import irvine.oeis.LinearRecurrence;

/**
 * A005319 a(n) = 6*a(n-1) - a(n-2).
 * @author Sean A. Irvine
 */
public class A005319 extends LinearRecurrence {

  /** Construct the sequence. */
  public A005319() {
    super(new long[] {-1, 6}, new long[] {0, 4});
  }
}
