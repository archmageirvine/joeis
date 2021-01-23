package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017551 a(n) = (12*n + 2)^7.
 * @author Sean A. Irvine
 */
public class A017551 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017551() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {128, 105413504, 8031810176L, 114415582592L, 781250000000L, 3521614606208L, 12151280273024L, 34792782221696L});
  }
}
