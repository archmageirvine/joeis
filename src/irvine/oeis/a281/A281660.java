package irvine.oeis.a281;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A281660 The least common multiple of 1+n and 1+n^2.
 * @author Sean A. Irvine
 */
public class A281660 extends LinearRecurrence {

  /** Construct the sequence. */
  public A281660() {
    super(new long[] {-1, 0, 4, 0, -6, 0, 4, 0}, new long[] {1, 2, 15, 20, 85, 78, 259, 200});
  }
}
