package irvine.oeis.a262;

import irvine.oeis.LinearRecurrence;

/**
 * A262397 <code>a(n) =</code> floor(A261327(n)/9).
 * @author Sean A. Irvine
 */
public class A262397 extends LinearRecurrence {

  /** Construct the sequence. */
  public A262397() {
    super(new long[] {1, 0, -2, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 2, 0}, new long[] {0, 0, 0, 1, 0, 3, 1, 5, 1, 9, 2, 13, 4, 19, 5, 25, 7, 32, 9, 40, 11, 49});
  }
}
