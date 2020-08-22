package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055998 a(n) = n*(n+5)/2.
 * @author Sean A. Irvine
 */
public class A055998 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055998() {
    super(new long[] {1, -3, 3}, new long[] {0, 3, 7});
  }
}
