package irvine.oeis.a086;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A086972 a(n) = n*3^(n-1) + (3^n + 1)/2.
 * @author Sean A. Irvine
 */
public class A086972 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086972() {
    super(new long[] {9, -15, 7}, new long[] {1, 3, 11});
  }
}
