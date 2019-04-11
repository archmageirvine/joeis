package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101213 <code>a(n) = n * (n+1)^2 * (n+2)^3</code>.
 * @author Sean A. Irvine
 */
public class A101213 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101213() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 108, 1152, 6000, 21600, 61740, 150528});
  }
}
