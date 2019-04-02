package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070380 a(n) = 5^n mod 32.
 * @author Sean A. Irvine
 */
public class A070380 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070380() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 5, 25, 29, 17, 21, 9, 13});
  }
}
