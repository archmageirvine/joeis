package irvine.oeis.a210;

import irvine.oeis.LinearRecurrence;

/**
 * A210440 <code>a(n) = 2*n*(n+1)*(n+2)/3</code>.
 * @author Sean A. Irvine
 */
public class A210440 extends LinearRecurrence {

  /** Construct the sequence. */
  public A210440() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 4, 16, 40});
  }
}
