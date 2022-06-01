package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017241 a(n) = (9*n + 6)^9.
 * @author Sean A. Irvine
 */
public class A017241 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017241() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {10077696, 38443359375L, 2641807540224L, 46411484401953L, 406671383849472L, 2334165173090451L, 10077696000000000L, 35452087835576229L, 106868920913284608L, 285544154243029527L});
  }
}
