package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059993 Pinwheel numbers: <code>a(n) = 2*n^2 + 6*n + 1</code>.
 * @author Sean A. Irvine
 */
public class A059993 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059993() {
    super(new long[] {1, -3, 3}, new long[] {1, 9, 21});
  }
}
