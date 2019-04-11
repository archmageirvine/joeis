package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134965 <code>a(0)=3</code>; for <code>n&gt;0, a(n) = a(n-1) + 7 + 2*mod(n, 2)</code>.
 * @author Sean A. Irvine
 */
public class A134965 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134965() {
    super(new long[] {-1, 1, 1}, new long[] {3, 12, 19});
  }
}
