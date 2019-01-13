package irvine.oeis.a023;

import irvine.oeis.LinearRecurrence;

/**
 * A023437.
 * @author Sean A. Irvine
 */
public class A023437 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023437() {
    super(new long[] {-1, 0, 0, 0, 0, 1, 1}, new long[] {0, 1, 1, 2, 3, 5, 8});
  }
}
