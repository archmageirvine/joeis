package irvine.oeis.a105;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A105637 a(n) = a(n-2)+a(n-3)-a(n-5).
 * @author Sean A. Irvine
 */
public class A105637 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105637() {
    super(new long[] {-1, 0, 1, 1, 0}, new long[] {0, 1, 2, 1, 3});
  }
}
