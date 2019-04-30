package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247698 Brady numbers: <code>B(n) = B(n - 1) + B(n - 2)</code> with <code>B(1) = 2308</code> and <code> B(2) = 4261</code>.
 * @author Sean A. Irvine
 */
public class A247698 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247698() {
    super(new long[] {1, 1}, new long[] {2308, 4261});
  }
}
