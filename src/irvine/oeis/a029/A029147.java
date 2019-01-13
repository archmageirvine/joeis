package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029147.
 * @author Sean A. Irvine
 */
public class A029147 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029147() {
    super(new long[] {-1, 0, 1, 1, 0, 0, 0, -1, -1, 0, 2, 0, -1, -1, 0, 0, 0, 1, 1, 0}, new long[] {1, 0, 1, 1, 1, 2, 2, 2, 3, 3, 5, 4, 6, 6, 7, 9, 9, 10, 12, 12});
  }
}
