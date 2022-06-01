package irvine.oeis.a255;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A255843 a(n) = 2*n^2 + 4.
 * @author Sean A. Irvine
 */
public class A255843 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255843() {
    super(new long[] {1, -3, 3}, new long[] {4, 6, 12});
  }
}
