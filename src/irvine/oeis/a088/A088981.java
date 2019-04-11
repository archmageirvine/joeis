package irvine.oeis.a088;

import irvine.oeis.LinearRecurrence;

/**
 * A088981 <code>a(n+2) = a(n+1) + a(n) - [(2*n)+1]</code> where <code>a(0)=7, a(1)=11</code>.
 * @author Sean A. Irvine
 */
public class A088981 extends LinearRecurrence {

  /** Construct the sequence. */
  public A088981() {
    super(new long[] {1, -1, -2, 3}, new long[] {7, 11, 17, 25});
  }
}
