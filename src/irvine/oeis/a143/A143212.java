package irvine.oeis.a143;

import irvine.oeis.LinearRecurrence;

/**
 * A143212 a(n) = F(n) * (F(n+2)-1) = A000045(n) * A000071(n+2) = row sums of triangle A143211.
 * @author Sean A. Irvine
 */
public class A143212 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143212() {
    super(new long[] {1, -1, -5, 1, 3}, new long[] {1, 2, 8, 21, 60});
  }
}
