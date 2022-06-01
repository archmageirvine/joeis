package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017234 a(n) = (9*n + 6)^2.
 * @author Sean A. Irvine
 */
public class A017234 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017234() {
    super(new long[] {1, -3, 3}, new long[] {36, 225, 576});
  }
}
