package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022267 <code>a(n) = n*(9*n + 1)/2</code>.
 * @author Sean A. Irvine
 */
public class A022267 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022267() {
    super(new long[] {1, -3, 3}, new long[] {0, 5, 19});
  }
}
