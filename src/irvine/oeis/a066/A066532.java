package irvine.oeis.a066;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A066532 If n is odd a(n) = 1, if n is even a(n) = 2^(n-1).
 * @author Sean A. Irvine
 */
public class A066532 extends LinearRecurrence {

  /** Construct the sequence. */
  public A066532() {
    super(new long[] {-4, 0, 5, 0}, new long[] {1, 2, 1, 8});
  }
}
