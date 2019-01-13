package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029416.
 * @author Sean A. Irvine
 */
public class A029416 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029416() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, -1, -1, -1, 0, 0, -1, -1, -1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0}, new long[] {1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 2, 1, 2, 1, 1, 0, 2, 2, 3, 2, 2, 1, 4, 2, 4, 3, 4, 2, 5, 4, 6});
  }
}
