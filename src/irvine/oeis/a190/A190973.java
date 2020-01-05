package irvine.oeis.a190;

import irvine.oeis.LinearRecurrence;

/**
 * A190973 <code>a(n) = 7*a(n-1) - 4*a(n-2)</code>, with <code>a(0) = 0, a(1) = 1</code>.
 * @author Sean A. Irvine
 */
public class A190973 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190973() {
    super(new long[] {-4, 7}, new long[] {0, 1});
  }
}
