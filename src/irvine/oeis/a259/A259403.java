package irvine.oeis.a259;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A259403 Pentagonal numbers (A000326) that are the sum of eleven consecutive pentagonal numbers.
 * @author Sean A. Irvine
 */
public class A259403 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259403() {
    super(1, new long[] {1, -1, -398, 398, 1}, new long[] {2882, 27676, 1114135, 10982301, 443390277});
  }
}
