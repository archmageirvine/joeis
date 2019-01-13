package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017151.
 * @author Sean A. Irvine
 */
public class A017151 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017151() {
    super(new long[] {-1, 4, -6, 4}, new long[] {343, 3375, 12167, 29791});
  }
}
