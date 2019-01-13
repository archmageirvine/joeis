package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024017.
 * @author Sean A. Irvine
 */
public class A024017 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024017() {
    super(new long[] {2, -17, 64, -140, 196, -182, 112, -44, 10}, new long[] {1, 1, -124, -2179, -16368, -78093, -279872, -823415, -2096896});
  }
}
