package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099562.
 * @author Sean A. Irvine
 */
public class A099562 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099562() {
    super(new long[] {-1, 0, 0, 0, -1, 2, 0, 0, 0, 1}, new long[] {0, 0, 0, 0, 0, 1, 1, 1, 1, 1});
  }
}
