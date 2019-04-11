package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070437 <code>a(n) = n^2 mod 14</code>.
 * @author Sean A. Irvine
 */
public class A070437 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070437() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 1, 4, 9, 2, 11, 8, 7, 8, 11, 2, 9, 4, 1});
  }
}
