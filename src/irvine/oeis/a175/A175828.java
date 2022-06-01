package irvine.oeis.a175;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A175828 a(n) = (n*(6*n+1)+(n+2)*(-1)^n)/2.
 * @author Sean A. Irvine
 */
public class A175828 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175828() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 2, 15, 26, 53});
  }
}
