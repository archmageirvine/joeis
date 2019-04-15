package irvine.oeis.a175;

import irvine.oeis.LinearRecurrence;

/**
 * A175676 <code>a(n) = binomial(n,3) mod n</code>.
 * @author Sean A. Irvine
 */
public class A175676 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175676() {
    super(new long[] {-1, 0, 0, 2, 0, 0}, new long[] {0, 0, 1, 0, 0, 2});
  }
}
