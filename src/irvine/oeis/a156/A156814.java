package irvine.oeis.a156;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A156814 a(n) = 225*n^2 + n.
 * @author Sean A. Irvine
 */
public class A156814 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156814() {
    super(1, new long[] {1, -3, 3}, new long[] {226, 902, 2028});
  }
}
