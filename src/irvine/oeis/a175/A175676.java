package irvine.oeis.a175;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A175676 a(n) = binomial(n,3) mod n.
 * @author Sean A. Irvine
 */
public class A175676 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175676() {
    super(1, new long[] {-1, 0, 0, 2, 0, 0}, new long[] {0, 0, 1, 0, 0, 2});
  }
}
