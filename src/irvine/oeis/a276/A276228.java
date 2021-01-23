package irvine.oeis.a276;

import irvine.oeis.LinearRecurrence;

/**
 * A276228 a(n+3) = -a(n+2) - 2*a(n+1) + a(n) with a(0)=3, a(1)=-1, a(2)=-3.
 * @author Sean A. Irvine
 */
public class A276228 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276228() {
    super(new long[] {1, -2, -1}, new long[] {3, -1, -3});
  }
}
