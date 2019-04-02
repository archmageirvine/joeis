package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070362 a(n) = 3^n mod 44.
 * @author Sean A. Irvine
 */
public class A070362 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070362() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 3, 9, 27, 37, 23, 25, 31, 5, 15});
  }
}
