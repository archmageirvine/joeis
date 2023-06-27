package irvine.oeis.a064;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A064806 a(n) = n + digital root of n.
 * @author Sean A. Irvine
 */
public class A064806 extends LinearRecurrence {

  /** Construct the sequence. */
  public A064806() {
    super(1, new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {2, 4, 6, 8, 10, 12, 14, 16, 18, 11});
  }
}
