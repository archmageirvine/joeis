package irvine.oeis.a070;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A070412 a(n) = 7^n mod 27.
 * @author Sean A. Irvine
 */
public class A070412 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070412() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 7, 22, 19, 25, 13, 10, 16, 4});
  }
}
