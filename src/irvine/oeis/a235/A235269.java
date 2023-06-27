package irvine.oeis.a235;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A235269 floor(s*t/(s+t)), where s(n) are the squares, t(n) the triangular numbers.
 * @author Sean A. Irvine
 */
public class A235269 extends LinearRecurrence {

  /** Construct the sequence. */
  public A235269() {
    super(1, new long[] {1, -2, 1, 0, 0, 0, 0, 0, 0, -1, 2}, new long[] {0, 1, 3, 6, 9, 13, 17, 23, 28, 35, 42});
  }
}
