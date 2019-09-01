package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226488 <code>a(n) = n*(13*n - 9)/2</code>.
 * @author Sean A. Irvine
 */
public class A226488 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226488() {
    super(new long[] {1, -3, 3}, new long[] {0, 2, 17});
  }
}
