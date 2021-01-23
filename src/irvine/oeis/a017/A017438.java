package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017438 a(n) = (11*n + 4)^2.
 * @author Sean A. Irvine
 */
public class A017438 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017438() {
    super(new long[] {1, -3, 3}, new long[] {16, 225, 676});
  }
}
