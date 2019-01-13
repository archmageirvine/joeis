package irvine.oeis.a035;

import irvine.oeis.LinearRecurrence;

/**
 * A035599.
 * @author Sean A. Irvine
 */
public class A035599 extends LinearRecurrence {

  /** Construct the sequence. */
  public A035599() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 2, 20, 102, 360, 1002});
  }
}
