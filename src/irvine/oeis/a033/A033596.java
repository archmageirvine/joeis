package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033596 <code>a(n) = (n^2 - 1)*(n^2 - 3)</code>.
 * @author Sean A. Irvine
 */
public class A033596 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033596() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {3, 0, 3, 48, 195});
  }
}
