package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017406 a(n) = (11n+1)^6.
 * @author Sean A. Irvine
 */
public class A017406 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017406() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 2985984, 148035889, 1544804416, 8303765625L, 30840979456L, 90458382169L});
  }
}
