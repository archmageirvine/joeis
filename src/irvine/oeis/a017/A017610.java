package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017610 (12n+7)^6.
 * @author Sean A. Irvine
 */
public class A017610 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017610() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {117649, 47045881, 887503681, 6321363049L, 27680640625L, 90458382169L, 243087455521L});
  }
}
