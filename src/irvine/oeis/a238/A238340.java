package irvine.oeis.a238;

import irvine.oeis.LinearRecurrence;

/**
 * A238340.
 * @author Sean A. Irvine
 */
public class A238340 extends LinearRecurrence {

  /** Construct the sequence. */
  public A238340() {
    super(new long[] {-1, 3, -3, 2, -3, 3}, new long[] {1, 5, 15, 34, 64, 108});
  }
}
