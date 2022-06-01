package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017342 a(n) = (10*n + 6)^2.
 * @author Sean A. Irvine
 */
public class A017342 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017342() {
    super(new long[] {1, -3, 3}, new long[] {36, 256, 676});
  }
}
