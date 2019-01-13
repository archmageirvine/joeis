package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029266.
 * @author Sean A. Irvine
 */
public class A029266 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029266() {
    super(new long[] {-1, 0, 0, 1, 1, 0, 0, -1, 0, 1, 1, 0, -1, -2, -1, 0, 1, 1, 0, -1, 0, 0, 1, 1, 0, 0}, new long[] {1, 0, 0, 1, 1, 0, 1, 1, 1, 2, 2, 1, 3, 3, 2, 3, 4, 3, 5, 5, 5, 6, 7, 6, 8, 8});
  }
}
