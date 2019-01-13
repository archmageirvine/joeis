package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099589.
 * @author Sean A. Irvine
 */
public class A099589 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099589() {
    super(new long[] {-2, 4, -6, 4}, new long[] {0, 0, 0, 1});
  }
}
