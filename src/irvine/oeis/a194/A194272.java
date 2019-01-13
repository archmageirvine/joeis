package irvine.oeis.a194;

import irvine.oeis.LinearRecurrence;

/**
 * A194272.
 * @author Sean A. Irvine
 */
public class A194272 extends LinearRecurrence {

  /** Construct the sequence. */
  public A194272() {
    super(new long[] {-1, 2, -1, -1, 2}, new long[] {1, 2, 3, 3, 3});
  }
}
