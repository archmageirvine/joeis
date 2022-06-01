package irvine.oeis.a226;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A226328 a(0)=1, a(1)=-2; a(n+2) = a(n+1) + a(n) + (period 3: repeat 3, 1, -1).
 * @author Sean A. Irvine
 */
public class A226328 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226328() {
    super(new long[] {-1, -1, 1, 1, 1}, new long[] {1, -2, 2, 1, 2});
  }
}
