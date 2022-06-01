package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017258 a(n) = (9*n + 8)^2.
 * @author Sean A. Irvine
 */
public class A017258 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017258() {
    super(new long[] {1, -3, 3}, new long[] {64, 289, 676});
  }
}
