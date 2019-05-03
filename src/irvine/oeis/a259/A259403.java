package irvine.oeis.a259;

import irvine.oeis.LinearRecurrence;

/**
 * A259403 Pentagonal numbers <code>(A000326)</code> that are the sum of eleven consecutive pentagonal numbers.
 * @author Sean A. Irvine
 */
public class A259403 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259403() {
    super(new long[] {1, -1, -398, 398, 1}, new long[] {2882, 27676, 1114135, 10982301, 443390277});
  }
}
