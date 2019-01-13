package irvine.oeis.a222;

import irvine.oeis.LinearRecurrence;

/**
 * A222309.
 * @author Sean A. Irvine
 */
public class A222309 extends LinearRecurrence {

  /** Construct the sequence. */
  public A222309() {
    super(new long[] {1, -3, -1, 11, -6, -14, 14, 6, -11, 1, 3}, new long[] {0, 4, 70, 476, 1961, 6204, 16167, 37040, 76486, 146300, 262260});
  }
}
