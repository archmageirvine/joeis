package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080877.
 * @author Sean A. Irvine
 */
public class A080877 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080877() {
    super(new long[] {-4, 0, 6, 0}, new long[] {1, 1, 2, 3});
  }
}
