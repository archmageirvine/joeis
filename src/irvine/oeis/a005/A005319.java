package irvine.oeis.a005;

import irvine.oeis.LinearRecurrence;

/**
 * A005319 <code>a(n) = 6a(n-1) - a(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A005319 extends LinearRecurrence {

  /** Construct the sequence. */
  public A005319() {
    super(new long[] {-1, 6}, new long[] {0, 4});
  }
}
