package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157433.
 * @author Sean A. Irvine
 */
public class A157433 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157433() {
    super(new long[] {1, -3, 3}, new long[] {13121, 15841, 18817});
  }
}
