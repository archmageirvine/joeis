package irvine.oeis.a063;

import irvine.oeis.LinearRecurrence;

/**
 * A063493 <code>a(n) = (2*n-1)*(13*n^2-13*n+6)/6</code>.
 * @author Sean A. Irvine
 */
public class A063493 extends LinearRecurrence {

  /** Construct the sequence. */
  public A063493() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 16, 70, 189});
  }
}
