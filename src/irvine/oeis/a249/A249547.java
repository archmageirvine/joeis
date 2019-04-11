package irvine.oeis.a249;

import irvine.oeis.LinearRecurrence;

/**
 * A249547 <code>a(n) = (10*n^2+8*n-1+(-1)^n)/8</code>.
 * @author Sean A. Irvine
 */
public class A249547 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249547() {
    super(new long[] {1, -2, 0, 2}, new long[] {0, 2, 7, 14});
  }
}
