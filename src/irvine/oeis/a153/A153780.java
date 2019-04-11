package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153780 10 times pentagonal numbers: <code>a(n) = 5*n*(3*n-1)</code>.
 * @author Sean A. Irvine
 */
public class A153780 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153780() {
    super(new long[] {1, -3, 3}, new long[] {0, 10, 50});
  }
}
