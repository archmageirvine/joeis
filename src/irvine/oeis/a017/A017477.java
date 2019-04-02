package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017477 a(n) = (11*n + 7)^5.
 * @author Sean A. Irvine
 */
public class A017477 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017477() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {16807, 1889568, 20511149, 102400000, 345025251, 916132832});
  }
}
