package irvine.oeis.a222;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A222739 Partial sums of the first 10^n terms in A181482.
 * @author Sean A. Irvine
 */
public class A222739 extends LinearRecurrence {

  /** Construct the sequence. */
  public A222739() {
    super(1, new long[] {-1000000, 1111000, -112110, 1111}, new long[] {76, 57256, 55722556, 55572225556L});
  }
}
