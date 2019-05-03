package irvine.oeis.a105;

import irvine.oeis.LinearRecurrence;

/**
 * A105099 Nonnegative numbers n such that <code>23*n^2 + 23*n + 1 = j^2 =</code> a square.
 * @author Sean A. Irvine
 */
public class A105099 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105099() {
    super(new long[] {1, -1, -2302, 2302, 1}, new long[] {0, 335, 815, 772320, 1877280});
  }
}
