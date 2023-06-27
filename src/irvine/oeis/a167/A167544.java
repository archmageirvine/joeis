package irvine.oeis.a167;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A167544 a(n) = (n-3)*(n-8)/2.
 * @author Sean A. Irvine
 */
public class A167544 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167544() {
    super(4, new long[] {1, -3, 3}, new long[] {-2, -3, -3});
  }
}
