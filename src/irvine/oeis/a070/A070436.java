package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070436 <code>a(n) = n^2 mod 13</code>.
 * @author Sean A. Irvine
 */
public class A070436 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070436() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 1, 4, 9, 3, 12, 10, 10, 12, 3, 9, 4, 1});
  }
}
