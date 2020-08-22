package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174592 Numbers n such that n^2 + 2*(n+2)^2 is a square.
 * @author Sean A. Irvine
 */
public class A174592 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174592() {
    super(new long[] {1, -15, 15}, new long[] {2, 46, 658});
  }
}
