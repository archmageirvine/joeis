package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107271.
 * @author Sean A. Irvine
 */
public class A107271 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107271() {
    super(new long[] {-2, 0, 0, 4, 0, 0, 2, 0, 0}, new long[] {1, 3, 2, 6, 6, 2, 14, 24, 12});
  }
}
