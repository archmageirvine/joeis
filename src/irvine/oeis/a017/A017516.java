package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017516 (11n+10)^8.
 * @author Sean A. Irvine
 */
public class A017516 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017516() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {100000000, 37822859361L, 1099511627776L, 11688200277601L, 72301961339136L, 318644812890625L, 1113034787454976L, 3282116715437121L, 8507630225817856L});
  }
}
