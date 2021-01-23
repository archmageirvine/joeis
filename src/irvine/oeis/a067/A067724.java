package irvine.oeis.a067;

import irvine.oeis.LinearRecurrence;

/**
 * A067724 a(n) = 5*n^2 + 10*n.
 * @author Sean A. Irvine
 */
public class A067724 extends LinearRecurrence {

  /** Construct the sequence. */
  public A067724() {
    super(new long[] {1, -3, 3}, new long[] {15, 40, 75});
  }
}
