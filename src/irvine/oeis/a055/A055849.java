package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055849 <code>a(n) = 3*a(n-1) - a(n-2)</code> with <code>a(0)=1, a(1)=9</code>.
 * @author Sean A. Irvine
 */
public class A055849 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055849() {
    super(new long[] {-1, 3}, new long[] {1, 9});
  }
}
