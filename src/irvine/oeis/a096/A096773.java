package irvine.oeis.a096;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A096773 a(n) = 4*a(n-2) + 1 with a(1) = 0, a(2) = 3.
 * @author Sean A. Irvine
 */
public class A096773 extends LinearRecurrence {

  /** Construct the sequence. */
  public A096773() {
    super(1, new long[] {-4, 4, 1}, new long[] {0, 3, 1});
  }
}
