package irvine.oeis.a070;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A070416 a(n) = 7^n mod 32.
 * @author Sean A. Irvine
 */
public class A070416 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070416() {
    super(new long[] {1, 0, 0, 0}, new long[] {1, 7, 17, 23});
  }
}
