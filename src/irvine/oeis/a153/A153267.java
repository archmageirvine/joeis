package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153267 <code>a(n) = -4*a(n-3) + 11*a(n-2) - a(n-1), a(0) = -5, a(1) = 39, a(2) = -110</code>.
 * @author Sean A. Irvine
 */
public class A153267 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153267() {
    super(new long[] {-4, 11, -1}, new long[] {-5, 39, -110});
  }
}
