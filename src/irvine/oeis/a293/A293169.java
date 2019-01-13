package irvine.oeis.a293;

import irvine.oeis.LinearRecurrence;

/**
 * A293169.
 * @author Sean A. Irvine
 */
public class A293169 extends LinearRecurrence {

  /** Construct the sequence. */
  public A293169() {
    super(new long[] {1, -1, 6, -15, 20, -15, 6}, new long[] {1, 1, 1, 1, 1, 1, 1});
  }
}
