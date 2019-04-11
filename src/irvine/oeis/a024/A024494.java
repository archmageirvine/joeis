package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024494 <code>a(n) =</code> C(n,1) + C(n,4) <code>+ ... +</code> C(n,3[n/3]+1).
 * @author Sean A. Irvine
 */
public class A024494 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024494() {
    super(new long[] {2, -3, 3}, new long[] {1, 2, 3});
  }
}
