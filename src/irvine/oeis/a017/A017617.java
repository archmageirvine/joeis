package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017617 a(n) = 12*n + 8.
 * @author Sean A. Irvine
 */
public class A017617 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017617() {
    super(new long[] {-1, 2}, new long[] {8, 20});
  }
}
