package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081353.
 * @author Sean A. Irvine
 */
public class A081353 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081353() {
    super(new long[] {1, -2, 0, 2}, new long[] {3, 5, 13, 19});
  }
}
