package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041253.
 * @author Sean A. Irvine
 */
public class A041253 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041253() {
    super(new long[] {-1, 0, 0, 0, 94, 0, 0, 0}, new long[] {1, 1, 3, 4, 91, 95, 281, 376});
  }
}
