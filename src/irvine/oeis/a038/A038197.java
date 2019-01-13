package irvine.oeis.a038;

import irvine.oeis.LinearRecurrence;

/**
 * A038197.
 * @author Sean A. Irvine
 */
public class A038197 extends LinearRecurrence {

  /** Construct the sequence. */
  public A038197() {
    super(new long[] {-1, 1, -1, 0, 0, 0, 3, -3, 3, -1, 1}, new long[] {1, 1, 1, 1, 2, 3, 4, 7, 9, 10, 19});
  }
}
