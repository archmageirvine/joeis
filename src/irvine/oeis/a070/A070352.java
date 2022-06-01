package irvine.oeis.a070;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A070352 a(n) = 3^n mod 5; or period 4, repeat [1, 3, 4, 2].
 * @author Sean A. Irvine
 */
public class A070352 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070352() {
    super(new long[] {1, -1, 1}, new long[] {1, 3, 4});
  }
}
