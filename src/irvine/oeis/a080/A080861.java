package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080861 15*n^2 + 6*n + 1.
 * @author Sean A. Irvine
 */
public class A080861 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080861() {
    super(new long[] {1, -3, 3}, new long[] {1, 22, 73});
  }
}
