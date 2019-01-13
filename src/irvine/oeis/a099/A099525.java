package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099525.
 * @author Sean A. Irvine
 */
public class A099525 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099525() {
    super(new long[] {3, 0, 2}, new long[] {1, 2, 4});
  }
}
