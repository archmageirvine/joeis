package irvine.oeis.a096;

import irvine.oeis.LinearRecurrence;

/**
 * A096053 a(n) = (3*9^n - 1)/2.
 * @author Sean A. Irvine
 */
public class A096053 extends LinearRecurrence {

  /** Construct the sequence. */
  public A096053() {
    super(new long[] {-9, 10}, new long[] {1, 13});
  }
}
