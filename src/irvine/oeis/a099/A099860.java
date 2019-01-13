package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099860.
 * @author Sean A. Irvine
 */
public class A099860 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099860() {
    super(new long[] {-1, 1, -1, 1, -1, 1}, new long[] {1, 1, 2, 2, 1, 1});
  }
}
