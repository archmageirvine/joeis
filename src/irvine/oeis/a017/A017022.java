package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017022 a(n) = (7*n + 3)^6.
 * @author Sean A. Irvine
 */
public class A017022 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017022() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {729, 1000000, 24137569, 191102976, 887503681, 3010936384L, 8303765625L});
  }
}
