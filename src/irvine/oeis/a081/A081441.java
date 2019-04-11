package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081441 <code>a(n) = (2*n^3-n^2-n+2)/2</code>.
 * @author Sean A. Irvine
 */
public class A081441 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081441() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 1, 6, 22});
  }
}
