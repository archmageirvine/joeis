package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017247 a(n) = (9*n + 7)^3.
 * @author Sean A. Irvine
 */
public class A017247 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017247() {
    super(new long[] {-1, 4, -6, 4}, new long[] {343, 4096, 15625, 39304});
  }
}
