package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157508 a(n) = 1458*n - 18.
 * @author Sean A. Irvine
 */
public class A157508 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157508() {
    super(1, new long[] {-1, 2}, new long[] {1440, 2898});
  }
}
