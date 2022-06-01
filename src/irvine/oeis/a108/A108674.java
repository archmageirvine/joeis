package irvine.oeis.a108;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A108674 a(n) = (n+1)^2 * (n+2)^2 * (2*n+3) / 12.
 * @author Sean A. Irvine
 */
public class A108674 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108674() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 15, 84, 300, 825, 1911});
  }
}
