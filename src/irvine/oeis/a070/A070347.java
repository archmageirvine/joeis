package irvine.oeis.a070;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A070347 a(n) = 2^n mod 21.
 * @author Sean A. Irvine
 */
public class A070347 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070347() {
    super(new long[] {1, -1, 1, -1, 1}, new long[] {1, 2, 4, 8, 16});
  }
}
