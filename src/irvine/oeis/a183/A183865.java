package irvine.oeis.a183;

import irvine.oeis.LinearRecurrence;

/**
 * A183865 n-1+ceiling(3(n+2)/5); complement of A183864.
 * @author Sean A. Irvine
 */
public class A183865 extends LinearRecurrence {

  /** Construct the sequence. */
  public A183865() {
    super(new long[] {1, -2, 1, 0, 0, -1, 2}, new long[] {1, 4, 8, 13, 19, 27, 36});
  }
}
