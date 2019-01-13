package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083672.
 * @author Sean A. Irvine
 */
public class A083672 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083672() {
    super(new long[] {-9, -12, 2, 4}, new long[] {1, 1, 9, 25});
  }
}
