package irvine.oeis.a185;

import irvine.oeis.LinearRecurrence;

/**
 * A185438 <code>a(n) = 8*n^2 - 2*n + 1</code>.
 * @author Sean A. Irvine
 */
public class A185438 extends LinearRecurrence {

  /** Construct the sequence. */
  public A185438() {
    super(new long[] {1, -3, 3}, new long[] {1, 7, 29});
  }
}
