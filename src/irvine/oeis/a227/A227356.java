package irvine.oeis.a227;

import irvine.oeis.LinearRecurrence;

/**
 * A227356.
 * @author Sean A. Irvine
 */
public class A227356 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227356() {
    super(new long[] {1, 0, -1, 1, -3, 1, 2}, new long[] {1, 2, 5, 10, 20, 36, 65});
  }
}
