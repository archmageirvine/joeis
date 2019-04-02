package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017306 a(n) = (10*n + 3)^2.
 * @author Sean A. Irvine
 */
public class A017306 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017306() {
    super(new long[] {1, -3, 3}, new long[] {9, 169, 529});
  }
}
