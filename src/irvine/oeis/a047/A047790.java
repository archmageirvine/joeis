package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047790.
 * @author Sean A. Irvine
 */
public class A047790 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047790() {
    super(new long[] {-2, 9, -12, 6}, new long[] {0, 0, 0, 1});
  }
}
