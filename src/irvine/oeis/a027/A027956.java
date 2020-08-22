package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027956 a(n) = T(2n+1, n+4), T given by A027948.
 * @author Sean A. Irvine
 */
public class A027956 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027956() {
    super(new long[] {-1, 11, -53, 148, -266, 322, -266, 148, -53, 11},
      new long[] {9, 175, 1518, 8735, 39130, 148487, 502415, 1568062, 4622488, 13091798}, 1);
  }
}
