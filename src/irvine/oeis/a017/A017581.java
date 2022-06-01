package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017581 a(n) = 12*n + 5.
 * @author Sean A. Irvine
 */
public class A017581 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017581() {
    super(new long[] {-1, 2}, new long[] {5, 17});
  }
}
