package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051942 Truncated triangular numbers: <code>a(n) =</code> n*(n+1)/2-3*t*(t+1)/2, t <code>= 5</code>.
 * @author Sean A. Irvine
 */
public class A051942 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051942() {
    super(new long[] {1, -3, 3}, new long[] {0, 10, 21});
  }
}
