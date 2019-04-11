package irvine.oeis.a175;

import irvine.oeis.LinearRecurrence;

/**
 * A175109 <code>a(n) = ((2*n+1)^3+(-1)^n)/2</code>.
 * @author Sean A. Irvine
 */
public class A175109 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175109() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {1, 13, 63, 171, 365});
  }
}
