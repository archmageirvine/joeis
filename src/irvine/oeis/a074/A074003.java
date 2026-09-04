package irvine.oeis.a074;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A074003 Number of elements of GF(3^n) with trace 1 and subtrace 0.
 * @author Sean A. Irvine
 */
public class A074003 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074003() {
    super(1, new long[] {27, 18, 9, 3, 0}, new long[] {1, 0, 3, 9, 30});
  }
}
