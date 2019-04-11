package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154374 <code>a(n) = 1250*n^2 - 100*n + 1</code>.
 * @author Sean A. Irvine
 */
public class A154374 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154374() {
    super(new long[] {1, -3, 3}, new long[] {1151, 4801, 10951});
  }
}
