package irvine.oeis.a202;

import irvine.oeis.LinearRecurrence;

/**
 * A202207 <code>a(n) = 3*a(n-1) - a(n-2) + a(n-3)</code> with <code>a(0)=1, a(1)=2, a(2)=5</code>.
 * @author Sean A. Irvine
 */
public class A202207 extends LinearRecurrence {

  /** Construct the sequence. */
  public A202207() {
    super(new long[] {1, -1, 3}, new long[] {1, 2, 5});
  }
}
