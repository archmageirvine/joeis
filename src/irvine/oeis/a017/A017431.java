package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017431 (11n+3)^7.
 * @author Sean A. Irvine
 */
public class A017431 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017431() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {2187, 105413504, 6103515625L, 78364164096L, 506623120463L, 2207984167552L, 7446353252589L, 20971520000000L});
  }
}
