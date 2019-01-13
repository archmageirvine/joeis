package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099492.
 * @author Sean A. Irvine
 */
public class A099492 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099492() {
    super(new long[] {-1, 0, -2, 2, -2, 0}, new long[] {1, 0, 0, 2, -1, -4});
  }
}
