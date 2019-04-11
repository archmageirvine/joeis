package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226449 <code>a(n) = n*(5*n^2-8*n+5)/2</code>.
 * @author Sean A. Irvine
 */
public class A226449 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226449() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 1, 9, 39});
  }
}
