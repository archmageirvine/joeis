package irvine.oeis.a265;

import irvine.oeis.LinearRecurrence;

/**
 * A265282.
 * @author Sean A. Irvine
 */
public class A265282 extends LinearRecurrence {

  /** Construct the sequence. */
  public A265282() {
    super(new long[] {-1, 1, 2, -2, 0, 0, -2, 2, 1}, new long[] {0, 1, 3, 5, 10, 13, 22, 26, 41});
  }
}
