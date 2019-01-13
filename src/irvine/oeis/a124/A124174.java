package irvine.oeis.a124;

import irvine.oeis.LinearRecurrence;

/**
 * A124174.
 * @author Sean A. Irvine
 */
public class A124174 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124174() {
    super(new long[] {1, -1, -34, 34, 1}, new long[] {0, 1, 10, 45, 351});
  }
}
