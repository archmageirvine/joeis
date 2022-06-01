package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017228 a(n) = (9*n + 5)^8.
 * @author Sean A. Irvine
 */
public class A017228 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017228() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {390625, 1475789056, 78310985281L, 1099511627776L, 7984925229121L, 39062500000000L, 146830437604321L, 457163239653376L, 1235736291547681L});
  }
}
