package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027625 Numerator of <code>n*(n+5)/((n+2)*(n+3))</code>.
 * @author Sean A. Irvine
 */
public class A027625 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027625() {
    super(new long[] {1, 0, 0, -3, 0, 0, 3, 0, 0}, new long[] {0, 1, 7, 4, 6, 25, 11, 14, 52});
  }
}
