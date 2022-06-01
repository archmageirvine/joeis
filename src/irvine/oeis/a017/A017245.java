package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017245 a(n) = 9*n + 7.
 * @author Sean A. Irvine
 */
public class A017245 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017245() {
    super(new long[] {-1, 2}, new long[] {7, 16});
  }
}
