package irvine.oeis.a271;

import irvine.oeis.LinearRecurrence;

/**
 * A271427 a(n) = 7^n - a(n-1) for n&gt;0, a(0)=0.
 * @author Sean A. Irvine
 */
public class A271427 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271427() {
    super(new long[] {7, 6}, new long[] {0, 7});
  }
}
