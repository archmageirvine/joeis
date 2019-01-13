package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157509.
 * @author Sean A. Irvine
 */
public class A157509 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157509() {
    super(new long[] {1, -3, 3}, new long[] {12799, 51841, 117127});
  }
}
