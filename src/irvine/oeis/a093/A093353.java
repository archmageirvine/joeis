package irvine.oeis.a093;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A093353 a(n) = (n + (n mod 2))*(n + 1)/2.
 * @author Sean A. Irvine
 */
public class A093353 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093353() {
    super(0, new long[] {1, -1, -2, 2, 1}, new long[] {0, 2, 3, 8, 10});
  }
}
