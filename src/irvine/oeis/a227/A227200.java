package irvine.oeis.a227;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A227200 a(n) = a(n-1) + a(n-2) - 2^(n-1) with a(0)=a(2)=0, a(1)=-a(3)=1, a(4)=-5.
 * @author Sean A. Irvine
 */
public class A227200 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227200() {
    super(new long[] {-2, -1, 3}, new long[] {0, 1, 0});
  }
}
