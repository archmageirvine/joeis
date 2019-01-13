package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099489.
 * @author Sean A. Irvine
 */
public class A099489 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099489() {
    super(new long[] {-1, 4, -2, 4}, new long[] {1, 3, 11, 42});
  }
}
