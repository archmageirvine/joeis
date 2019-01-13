package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099743.
 * @author Sean A. Irvine
 */
public class A099743 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099743() {
    super(new long[] {-24, 44, -30, 9}, new long[] {0, 0, 2, 15});
  }
}
