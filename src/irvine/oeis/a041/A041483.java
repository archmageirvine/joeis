package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041483.
 * @author Sean A. Irvine
 */
public class A041483 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041483() {
    super(new long[] {-1, 0, 514, 0}, new long[] {1, 16, 513, 8224});
  }
}
