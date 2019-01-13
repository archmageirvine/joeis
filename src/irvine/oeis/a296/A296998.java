package irvine.oeis.a296;

import irvine.oeis.LinearRecurrence;

/**
 * A296998.
 * @author Sean A. Irvine
 */
public class A296998 extends LinearRecurrence {

  /** Construct the sequence. */
  public A296998() {
    super(new long[] {1, -3, 1, 3, -1, 3, -8, 0, 2, 2, 10, -10, -2, -2, 0, 8, -3, 1, -3, -1, 3}, new long[] {0, 1, 90, 1620, 11810, 56613, 206234, 623904, 1641654, 3882985, 8431280, 17078364, 32641102, 59401153, 103638420, 174341920, 284041304, 449881893, 694849380, 1049316180, 1552766796});
  }
}
