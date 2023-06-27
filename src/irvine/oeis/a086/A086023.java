package irvine.oeis.a086;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A086023 a(n) = Sum_{i=1..n} C(i+3,4)^2.
 * @author Sean A. Irvine
 */
public class A086023 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086023() {
    super(1, new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {1, 26, 251, 1476, 6376, 22252, 66352, 175252, 420277, 931502});
  }
}
