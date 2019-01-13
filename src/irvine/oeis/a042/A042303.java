package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042303.
 * @author Sean A. Irvine
 */
public class A042303 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042303() {
    super(new long[] {-1, 0, 1354, 0}, new long[] {1, 26, 1353, 35204});
  }
}
