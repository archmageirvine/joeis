package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153795 5 times octagonal numbers: <code>a(n) = 5*n*(3*n-2)</code>.
 * @author Sean A. Irvine
 */
public class A153795 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153795() {
    super(new long[] {1, -3, 3}, new long[] {0, 5, 40});
  }
}
