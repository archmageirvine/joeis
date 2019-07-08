package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173674 <code>a(n) = ceiling(A003269(n)/2)</code>.
 * @author Sean A. Irvine
 */
public class A173674 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173674() {
    super(new long[] {-1, 0, 0, -1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1}, new long[] {0, 1, 1, 1, 1, 1, 2, 2, 3, 4, 5, 7, 10, 13, 18, 25, 35, 48, 66});
  }
}
