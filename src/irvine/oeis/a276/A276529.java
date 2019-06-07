package irvine.oeis.a276;

import irvine.oeis.LinearRecurrence;

/**
 * A276529 <code>a(n) = (a(n-1) * a(n-5) + 1) / a(n-6), a(0) = a(1) = ... = a(5) = 1</code>.
 * @author Sean A. Irvine
 */
public class A276529 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276529() {
    super(new long[] {-1, 0, 0, 0, 0, 7, 0, 0, 0, 0}, new long[] {1, 1, 1, 1, 1, 1, 2, 3, 4, 5});
  }
}
