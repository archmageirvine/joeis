package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029194.
 * @author Sean A. Irvine
 */
public class A029194 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029194() {
    super(new long[] {-1, 0, 1, 0, 0, 1, 1, -1, 0, 0, -1, -1, 0, 0, -1, 1, 1, 0, 0, 1, 0}, new long[] {1, 0, 1, 0, 1, 1, 2, 1, 3, 1, 4, 2, 5, 3, 6, 4, 8, 5, 10, 6, 12});
  }
}
