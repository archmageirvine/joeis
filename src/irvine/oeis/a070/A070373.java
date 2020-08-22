package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070373 a(n) = 5^n mod 19.
 * @author Sean A. Irvine
 */
public class A070373 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070373() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 5, 6, 11, 17, 9, 7, 16, 4});
  }
}
