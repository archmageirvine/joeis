package irvine.oeis.a216;

import irvine.oeis.LinearRecurrence;

/**
 * A216450 <code>a(n) = -10*a(n-1) - 3*a(n-2) + a(n-3)</code> with <code>a(0) = 3, a(1) = -20</code>, and <code>a(2) = 94</code>.
 * @author Sean A. Irvine
 */
public class A216450 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216450() {
    super(new long[] {1, -3, -10}, new long[] {3, -10, 94});
  }
}
