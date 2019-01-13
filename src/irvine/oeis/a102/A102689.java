package irvine.oeis.a102;

import irvine.oeis.LinearRecurrence;

/**
 * A102689.
 * @author Sean A. Irvine
 */
public class A102689 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102689() {
    super(new long[] {-1, 2}, new long[] {2468, 12468});
  }
}
