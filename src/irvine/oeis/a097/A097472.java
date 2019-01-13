package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097472.
 * @author Sean A. Irvine
 */
public class A097472 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097472() {
    super(new long[] {-1, -2, 1, 3}, new long[] {1, 3, 10, 31});
  }
}
