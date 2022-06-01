package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081276 Floor(n^3/8).
 * @author Sean A. Irvine
 */
public class A081276 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081276() {
    super(new long[] {-1, 3, -3, 1, 0, 0, 0, 0, 1, -3, 3}, new long[] {0, 0, 1, 3, 8, 15, 27, 42, 64, 91, 125});
  }
}
