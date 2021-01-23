package irvine.oeis.a211;

import irvine.oeis.LinearRecurrence;

/**
 * A211704 a(n) = n + [n/2] + [n/3] + [n/4] + [n/5], where []=floor.
 * @author Sean A. Irvine
 */
public class A211704 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211704() {
    super(new long[] {-1, -1, -1, 0, 1, 2, 2, 1, 0, -1, -1}, new long[] {1, 3, 5, 8, 10, 13, 14, 17, 19, 22, 23});
  }
}
