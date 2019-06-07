package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156814 <code>a(n) = 225*n^2 + n</code>.
 * @author Sean A. Irvine
 */
public class A156814 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156814() {
    super(new long[] {1, -3, 3}, new long[] {226, 902, 2028});
  }
}
