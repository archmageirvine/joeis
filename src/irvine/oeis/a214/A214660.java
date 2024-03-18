package irvine.oeis.a214;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A214660 a(n) = 9*n^2 - 11*n + 3.
 * @author Sean A. Irvine
 */
public class A214660 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214660() {
    super(1, new long[] {1, -3, 3}, new long[] {1, 17, 51});
  }
}
