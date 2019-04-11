package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226639 <code>a(n) = n^4/8 + (5*n^3)/12 - n^2/8 - (5*n)/12 + 1</code>.
 * @author Sean A. Irvine
 */
public class A226639 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226639() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 1, 1, 5, 20});
  }
}
