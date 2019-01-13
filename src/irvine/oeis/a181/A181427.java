package irvine.oeis.a181;

import irvine.oeis.LinearRecurrence;

/**
 * A181427.
 * @author Sean A. Irvine
 */
public class A181427 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181427() {
    super(new long[] {-1, 0, 4, 0, -6, 0, 4, 0}, new long[] {2, 10, 12, 68, 30, 222, 56, 520});
  }
}
