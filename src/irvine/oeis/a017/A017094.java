package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017094 a(n) = (8*n + 2)^6.
 * @author Sean A. Irvine
 */
public class A017094 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017094() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {64, 1000000, 34012224, 308915776, 1544804416, 5489031744L, 15625000000L});
  }
}
