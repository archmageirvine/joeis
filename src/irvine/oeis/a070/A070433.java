package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070433 a(n) = n^2 mod 9.
 * @author Sean A. Irvine
 */
public class A070433 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070433() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 1, 4, 0, 7, 7, 0, 4, 1});
  }
}
