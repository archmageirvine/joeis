package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130844 <code>a(n) = 2*a(n-1) + a(n-2) - a(n-3) + a(n-4)</code>, with <code>a(1) = 0, a(2) = 3, a(3) = 5</code> and <code>a(4) = 17</code>.
 * @author Sean A. Irvine
 */
public class A130844 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130844() {
    super(new long[] {1, -1, 1, 2}, new long[] {0, 3, 5, 17});
  }
}
