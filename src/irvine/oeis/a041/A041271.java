package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041271.
 * @author Sean A. Irvine
 */
public class A041271 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041271() {
    super(new long[] {-1, 0, 146, 0}, new long[] {1, 6, 145, 876});
  }
}
