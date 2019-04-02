package irvine.oeis.a238;

import irvine.oeis.LinearRecurrence;

/**
 * A238374 Row sums of triangle in A204026.
 * @author Sean A. Irvine
 */
public class A238374 extends LinearRecurrence {

  /** Construct the sequence. */
  public A238374() {
    super(new long[] {-1, 1, -1, 1, 1}, new long[] {1, 2, 4, 6, 9});
  }
}
