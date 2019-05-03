package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133146 Antidiagonal sums of the triangle <code>A133128</code>.
 * @author Sean A. Irvine
 */
public class A133146 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133146() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {2, 5, 7, 14, 18});
  }
}
