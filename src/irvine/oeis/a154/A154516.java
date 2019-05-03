package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154516 <code>a(n) = 9n^2 -</code> n.
 * @author Sean A. Irvine
 */
public class A154516 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154516() {
    super(new long[] {1, -3, 3}, new long[] {8, 34, 78});
  }
}
