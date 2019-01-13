package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094687.
 * @author Sean A. Irvine
 */
public class A094687 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094687() {
    super(new long[] {-2, -3, 2, 2}, new long[] {0, 0, 1, 2});
  }
}
