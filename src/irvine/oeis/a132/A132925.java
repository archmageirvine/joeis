package irvine.oeis.a132;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A132925 a(n) = 2^n - 1 + n*(n-1)/2.
 * @author Sean A. Irvine
 */
public class A132925 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132925() {
    super(1, new long[] {-2, 7, -9, 5}, new long[] {1, 4, 10, 21});
  }
}
