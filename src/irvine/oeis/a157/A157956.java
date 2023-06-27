package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157956 a(n) = 200*n + 1.
 * @author Sean A. Irvine
 */
public class A157956 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157956() {
    super(1, new long[] {-1, 2}, new long[] {201, 401});
  }
}
