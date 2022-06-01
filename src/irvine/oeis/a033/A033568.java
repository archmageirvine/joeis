package irvine.oeis.a033;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A033568 Second pentagonal numbers with odd index: a(n) = (2*n-1)*(3*n-1).
 * @author Sean A. Irvine
 */
public class A033568 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033568() {
    super(new long[] {1, -3, 3}, new long[] {1, 2, 15});
  }
}
