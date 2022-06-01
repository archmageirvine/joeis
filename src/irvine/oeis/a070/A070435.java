package irvine.oeis.a070;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A070435 a(n) = n^2 mod 12, or alternately n^4 mod 12.
 * @author Sean A. Irvine
 */
public class A070435 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070435() {
    super(new long[] {1, 0, 0, 0, 0, 0}, new long[] {0, 1, 4, 9, 4, 1});
  }
}
