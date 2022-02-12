package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027780 a(n) = 7*(n+1)*binomial(n+2,7)/2.
 * @author Sean A. Irvine
 */
public class A027780 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027780() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {21, 196, 1008, 3780, 11550, 30492, 72072, 156156, 315315});
  }
}
