package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027819 7*(n+1)*C(n+6,7)/2.
 * @author Sean A. Irvine
 */
public class A027819 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027819() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {7, 84, 504, 2100, 6930, 19404, 48048, 108108, 225225});
  }
}
