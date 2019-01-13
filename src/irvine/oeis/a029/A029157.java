package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029157.
 * @author Sean A. Irvine
 */
public class A029157 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029157() {
    super(new long[] {-1, 0, 1, 1, 0, -1, 0, 1, 0, 0, -1, -1, 0, 0, 1, 0, -1, 0, 1, 1, 0}, new long[] {1, 0, 1, 1, 1, 1, 2, 2, 2, 4, 3, 4, 5, 5, 6, 7, 8, 8, 11, 10, 12});
  }
}
