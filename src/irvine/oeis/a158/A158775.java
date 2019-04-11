package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158775 <code>a(n) = 1600*n^2 + 40</code>.
 * @author Sean A. Irvine
 */
public class A158775 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158775() {
    super(new long[] {1, -3, 3}, new long[] {1640, 6440, 14440});
  }
}
