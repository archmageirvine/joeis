package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193005.
 * @author Sean A. Irvine
 */
public class A193005 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193005() {
    super(new long[] {1, -3, 1, 6, -9, 5}, new long[] {0, 1, 2, 11, 40, 115});
  }
}
