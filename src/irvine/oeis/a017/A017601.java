package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017601 (12n+6)^9.
 * @author Sean A. Irvine
 */
public class A017601 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017601() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {10077696, 198359290368L, 19683000000000L, 406671383849472L, 3904305912313344L, 23762680013799936L, 106868920913284608L, 387420489000000000L, 1195092568622310912L, 3251948521156637184L});
  }
}
