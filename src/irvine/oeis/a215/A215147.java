package irvine.oeis.a215;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A215147 For n odd, a(n) = 1^2+2^2+3^2+...+n^2; for n even, a(n) = (1^2+2^2+3^2+...+n^2)+1.
 * @author Sean A. Irvine
 */
public class A215147 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215147() {
    super(1, new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {1, 2, 5, 6, 14, 15, 30});
  }
}
