package irvine.oeis.a263;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A263231 a(n) = n*(25*n - 39)/2.
 * @author Sean A. Irvine
 */
public class A263231 extends LinearRecurrence {

  /** Construct the sequence. */
  public A263231() {
    super(new long[] {1, -3, 3}, new long[] {0, -7, 11});
  }
}
