package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247698 Brady numbers: B(n) = B(n <code>- 1) +</code> B(n <code>- 2)</code> with B(1) <code>= 2308</code> and B(2) <code>= 4261</code>.
 * @author Sean A. Irvine
 */
public class A247698 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247698() {
    super(new long[] {1, 1}, new long[] {2308, 4261});
  }
}
