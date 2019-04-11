package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048572 <code>a(n) =</code> sum of digits of <code>a(n-1)*a(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A048572 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048572() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 2, 2, 4, 8, 5, 4, 2, 8, 7, 11, 14, 10, 5, 5, 7, 8, 11, 16, 14, 8, 4, 5, 2});
  }
}
