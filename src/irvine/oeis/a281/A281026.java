package irvine.oeis.a281;

import irvine.oeis.LinearRecurrence;

/**
 * A281026 <code>a(n) = floor(3*n*(n+1)/4)</code>.
 * @author Sean A. Irvine
 */
public class A281026 extends LinearRecurrence {

  /** Construct the sequence. */
  public A281026() {
    super(new long[] {1, -3, 4, -4, 3}, new long[] {0, 1, 4, 9, 15});
  }
}
