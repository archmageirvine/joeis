package irvine.oeis.a254;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A254368 a(n) = 5*2^n + 3^n + 15.
 * @author Sean A. Irvine
 */
public class A254368 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254368() {
    super(new long[] {6, -11, 6}, new long[] {21, 28, 44});
  }
}
