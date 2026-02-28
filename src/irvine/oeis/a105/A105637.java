package irvine.oeis.a105;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A105637 a(n) = a(n-2) + a(n-3) - a(n-5), with a(0) = 0, a(1) = 1, a(2) = 2, a(3) = 1, a(4) = 3, a(5) = 3.
 * @author Sean A. Irvine
 */
public class A105637 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105637() {
    super(new long[] {-1, 0, 1, 1, 0}, new long[] {0, 1, 2, 1, 3});
  }
}
