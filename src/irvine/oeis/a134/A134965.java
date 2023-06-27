package irvine.oeis.a134;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A134965 a(1)=3, a(n) = a(n-1) + 7 + 2*mod(n-1, 2) for n&gt;=2.
 * @author Sean A. Irvine
 */
public class A134965 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134965() {
    super(1, new long[] {-1, 1, 1}, new long[] {3, 12, 19});
  }
}
