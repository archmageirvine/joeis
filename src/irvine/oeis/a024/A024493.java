package irvine.oeis.a024;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A024493 a(n) = C(n,0) + C(n,3) + ... + C(n,3[n/3]).
 * @author Sean A. Irvine
 */
public class A024493 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024493() {
    super(new long[] {2, -3, 3}, new long[] {1, 1, 1});
  }
}
