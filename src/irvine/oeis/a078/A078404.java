package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078404 Expansion of Molien series for a certain 4-D group of order 192.
 * @author Sean A. Irvine
 */
public class A078404 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078404() {
    super(new long[] {-1, 2, -1, 0, 1, -2, 1, 0, 0, 0, 0, 0, 1, -2, 1, 0, -1, 2}, new long[] {1, 1, 1, 2, 4, 5, 7, 9, 14, 17, 22, 27, 36, 43, 52, 61, 75, 87});
  }
}
