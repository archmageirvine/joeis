package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107953.
 * @author Sean A. Irvine
 */
public class A107953 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107953() {
    super(new long[] {16, -48, 56, -32, 9}, new long[] {31, 175, 703, 2415, 7551});
  }
}
