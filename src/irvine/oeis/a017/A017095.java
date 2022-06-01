package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017095 a(n) = (8*n + 2)^7.
 * @author Sean A. Irvine
 */
public class A017095 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017095() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {128, 10000000, 612220032, 8031810176L, 52523350144L, 230539333248L, 781250000000L, 2207984167552L});
  }
}
