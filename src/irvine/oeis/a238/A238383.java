package irvine.oeis.a238;

import irvine.oeis.LinearRecurrence;

/**
 * A238383 Row sums of triangle in A139040.
 * @author Sean A. Irvine
 */
public class A238383 extends LinearRecurrence {

  /** Construct the sequence. */
  public A238383() {
    super(new long[] {-1, 1, 0, 0, -1, 1, 1}, new long[] {1, 2, 3, 4, 6, 8, 11});
  }
}
