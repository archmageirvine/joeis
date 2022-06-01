package irvine.oeis.a175;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A175113 a(n) = ((2*n + 1)^6 + 1)/2.
 * @author Sean A. Irvine
 */
public class A175113 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175113() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 365, 7813, 58825, 265721, 885781, 2413405});
  }
}
