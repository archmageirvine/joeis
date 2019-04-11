package irvine.oeis.a242;

import irvine.oeis.LinearRecurrence;

/**
 * A242135 <code>a(n) = n^3 - 2*n</code>.
 * @author Sean A. Irvine
 */
public class A242135 extends LinearRecurrence {

  /** Construct the sequence. */
  public A242135() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, -1, 4, 21});
  }
}
