package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291402.
 * @author Sean A. Irvine
 */
public class A291402 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291402() {
    super(new long[] {1, 4, 7, 7, 4, 1, 0, 0}, new long[] {0, 0, 1, 4, 7, 8, 12, 31});
  }
}
