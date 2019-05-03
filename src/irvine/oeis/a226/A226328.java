package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226328 <code>a(0)=1, a(1)=-2; a(n+2) = a(n+1) + a(n) +</code> (period <code>3</code>: repeat <code>3, 1, -1)</code>.
 * @author Sean A. Irvine
 */
public class A226328 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226328() {
    super(new long[] {-1, -1, 1, 1, 1}, new long[] {1, -2, 2, 1, 2});
  }
}
