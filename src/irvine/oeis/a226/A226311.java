package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226311 a(n+5) = a(n+4)+a(n+3)+a(n+2)+a(n+1)+2*a(n) with a(0)=2, a(1)=1, a(2)=5, a(3)=10, a(4)=20.
 * @author Sean A. Irvine
 */
public class A226311 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226311() {
    super(new long[] {2, 1, 1, 1, 1}, new long[] {2, 1, 5, 10, 20});
  }
}
