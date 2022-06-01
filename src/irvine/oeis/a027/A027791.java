package irvine.oeis.a027;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A027791 a(n) = 5*(n+1)*binomial(n+3,6).
 * @author Sean A. Irvine
 */
public class A027791 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027791() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {20, 175, 840, 2940, 8400, 20790, 46200, 94380});
  }
}
