package irvine.oeis.a175;

import irvine.oeis.LinearRecurrence;

/**
 * A175113.
 * @author Sean A. Irvine
 */
public class A175113 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175113() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 365, 7813, 58825, 265721, 885781, 2413405});
  }
}
