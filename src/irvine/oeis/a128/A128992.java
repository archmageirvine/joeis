package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128992 <code>a(n) = (n^3 - n^2)*9^n</code>.
 * @author Sean A. Irvine
 */
public class A128992 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128992() {
    super(new long[] {-6561, 2916, -486, 36}, new long[] {0, 324, 13122, 314928});
  }
}
