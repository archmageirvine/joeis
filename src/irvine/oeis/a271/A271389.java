package irvine.oeis.a271;

import irvine.oeis.LinearRecurrence;

/**
 * A271389 <code>a(n) = 2*a(n-1) + a(n-2) + n^2</code> for <code>n&gt;1</code>, with <code> a(0)=0, a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A271389 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271389() {
    super(new long[] {-1, 1, 4, -8, 5}, new long[] {0, 1, 6, 22, 66});
  }
}
