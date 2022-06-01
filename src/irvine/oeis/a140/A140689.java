package irvine.oeis.a140;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A140689 a(n) = n*(3*n + 20).
 * @author Sean A. Irvine
 */
public class A140689 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140689() {
    super(new long[] {1, -3, 3}, new long[] {0, 23, 52});
  }
}
