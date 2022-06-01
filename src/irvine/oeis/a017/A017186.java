package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017186 a(n) = (9*n + 2)^2.
 * @author Sean A. Irvine
 */
public class A017186 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017186() {
    super(new long[] {1, -3, 3}, new long[] {4, 121, 400});
  }
}
