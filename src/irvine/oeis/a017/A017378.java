package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017378 a(n) = (10*n + 9)^2.
 * @author Sean A. Irvine
 */
public class A017378 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017378() {
    super(new long[] {1, -3, 3}, new long[] {81, 361, 841});
  }
}
