package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017455 a(n) = (11*n + 5)^7.
 * @author Sean A. Irvine
 */
public class A017455 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017455() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {78125, 268435456, 10460353203L, 114415582592L, 678223072849L, 2799360000000L, 9095120158391L, 24928547056768L});
  }
}
