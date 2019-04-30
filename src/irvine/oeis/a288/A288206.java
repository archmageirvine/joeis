package irvine.oeis.a288;

import irvine.oeis.LinearRecurrence;

/**
 * A288206 <code>a(n) = 3*a(n-1) - a(n-2) - 3*a(n-3) + 2*a(n-4)</code>, where <code>a(0) = 2, a(1) = 4, a(2) = 8, a(3) = 18</code>.
 * @author Sean A. Irvine
 */
public class A288206 extends LinearRecurrence {

  /** Construct the sequence. */
  public A288206() {
    super(new long[] {2, -3, -1, 3}, new long[] {2, 4, 8, 18});
  }
}
