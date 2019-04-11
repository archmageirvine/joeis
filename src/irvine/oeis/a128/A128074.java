package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128074 <code>a(n) = (n^3+n)*9^n</code>.
 * @author Sean A. Irvine
 */
public class A128074 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128074() {
    super(new long[] {-6561, 2916, -486, 36}, new long[] {0, 18, 810, 21870});
  }
}
