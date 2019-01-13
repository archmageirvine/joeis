package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081272.
 * @author Sean A. Irvine
 */
public class A081272 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081272() {
    super(new long[] {1, -3, 3}, new long[] {1, 25, 85});
  }
}
