package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153792 12 times pentagonal numbers: <code>a(n) = 6*n*(3*n-1)</code>.
 * @author Sean A. Irvine
 */
public class A153792 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153792() {
    super(new long[] {1, -3, 3}, new long[] {0, 12, 60});
  }
}
