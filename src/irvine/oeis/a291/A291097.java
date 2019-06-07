package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291097 <code>a(n) = 2^n*(n/8 + 1) - n</code>.
 * @author Sean A. Irvine
 */
public class A291097 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291097() {
    super(new long[] {-4, 12, -13, 6}, new long[] {3, 8, 20, 47});
  }
}
