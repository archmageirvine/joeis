package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099359 a(n) = (2^n + 1)^3 - 2.
 * @author Sean A. Irvine
 */
public class A099359 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099359() {
    super(new long[] {-64, 120, -70, 15}, new long[] {6, 25, 123, 727});
  }
}
