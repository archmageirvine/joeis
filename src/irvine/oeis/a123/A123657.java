package irvine.oeis.a123;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A123657 a(n) = 1 + n^4 + n^6 + n^9.
 * @author Sean A. Irvine
 */
public class A123657 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123657() {
    super(1, new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {4, 593, 20494, 266497, 1969376, 10125649, 40473658, 134483969, 387958492, 1001010001});
  }
}
