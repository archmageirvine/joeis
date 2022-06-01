package irvine.oeis.a025;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A025171 Reciprocal Chebyshev polynomial of second kind evaluated at 4 multiplied by (-1)^n.
 * @author Sean A. Irvine
 */
public class A025171 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025171() {
    super(new long[] {-16, -2}, new long[] {1, -2});
  }
}
