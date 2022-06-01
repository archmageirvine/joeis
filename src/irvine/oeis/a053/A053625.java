package irvine.oeis.a053;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A053625 Product of 6 consecutive integers.
 * @author Sean A. Irvine
 */
public class A053625 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053625() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 0, 0, 0, 0, 0, 720});
  }
}
