package irvine.oeis.a179;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A179054 a(n) = (1^k + 2^k + ... + n^k) modulo (n+2), where k is any odd integer greater than or equal to 3.
 * @author Sean A. Irvine
 */
public class A179054 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179054() {
    super(1, new long[] {-1, 0, 0, 0, 2, 0, 0, 0}, new long[] {1, 1, 1, 4, 1, 1, 1, 6});
  }
}
