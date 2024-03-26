package irvine.oeis.a145;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A145923 Second bisection of A061041: a(n) = A061041(2n+1) = (2*n+1)*(2*n+9).
 * @author Sean A. Irvine
 */
public class A145923 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145923() {
    super(new long[] {1, -3, 3}, new long[] {9, 33, 65});
  }
}
