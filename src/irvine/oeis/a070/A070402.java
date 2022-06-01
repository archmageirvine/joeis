package irvine.oeis.a070;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A070402 a(n) = 2^n mod 5.
 * @author Sean A. Irvine
 */
public class A070402 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070402() {
    super(new long[] {1, -1, 1}, new long[] {1, 2, 4});
  }
}
