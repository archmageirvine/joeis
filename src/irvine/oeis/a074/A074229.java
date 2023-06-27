package irvine.oeis.a074;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A074229 Numbers n such that Kronecker(6,n)==mu(gcd(6,n)).
 * @author Sean A. Irvine
 */
public class A074229 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074229() {
    super(1, new long[] {-1, 1, 0, 0, 1}, new long[] {1, 5, 19, 23, 25});
  }
}
