package irvine.oeis.a036;

import irvine.oeis.LinearRecurrence;

/**
 * A036549 <code>a(n) = T(8,n)</code>, array T given by A048471.
 * @author Sean A. Irvine
 */
public class A036549 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036549() {
    super(new long[] {-3, 4}, new long[] {1, 257});
  }
}
