package irvine.oeis.a222;

import irvine.oeis.LinearRecurrence;

/**
 * A222739 Partial sums of the first <code>10^n</code> terms in <code>A181482</code>.
 * @author Sean A. Irvine
 */
public class A222739 extends LinearRecurrence {

  /** Construct the sequence. */
  public A222739() {
    super(new long[] {-1000000, 1111000, -112110, 1111}, new long[] {76, 57256, 55722556, 55572225556L});
  }
}
