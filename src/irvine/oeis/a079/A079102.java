package irvine.oeis.a079;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A079102 a(2n) = 2^n, a(2n+1) = 2^(2n).
 * @author Sean A. Irvine
 */
public class A079102 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079102() {
    super(new long[] {-8, 0, 6, 0}, new long[] {1, 2, 4, 4});
  }
}
