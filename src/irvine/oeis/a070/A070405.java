package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070405 a(n) = 7^n mod 13.
 * @author Sean A. Irvine
 */
public class A070405 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070405() {
    super(new long[] {1, -1, 0, 0, 0, 0, 1}, new long[] {1, 7, 10, 5, 9, 11, 12});
  }
}
