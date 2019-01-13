package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099783.
 * @author Sean A. Irvine
 */
public class A099783 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099783() {
    super(new long[] {3, -9, 6}, new long[] {1, 3, 9});
  }
}
