package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047597.
 * @author Sean A. Irvine
 */
public class A047597 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047597() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {0, 2, 3, 4, 5, 8});
  }
}
