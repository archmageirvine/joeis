package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099480.
 * @author Sean A. Irvine
 */
public class A099480 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099480() {
    super(new long[] {-1, 2, -2, 2, -2, 2}, new long[] {1, 2, 2, 2, 2, 2});
  }
}
