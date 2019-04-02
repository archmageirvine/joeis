package irvine.oeis.a271;

import irvine.oeis.LinearRecurrence;

/**
 * A271389 a(n) = 2*a(n-1) + a(n-2) + n^2 for n&gt;1, with a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A271389 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271389() {
    super(new long[] {-1, 1, 4, -8, 5}, new long[] {0, 1, 6, 22, 66});
  }
}
