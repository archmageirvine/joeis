package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154576 <code>a(n) = 2*n^2 + 14*n + 5</code>.
 * @author Sean A. Irvine
 */
public class A154576 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154576() {
    super(new long[] {1, -3, 3}, new long[] {21, 41, 65});
  }
}
