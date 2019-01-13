package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041931.
 * @author Sean A. Irvine
 */
public class A041931 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041931() {
    super(new long[] {-1, 0, 486, 0}, new long[] {1, 11, 485, 5346});
  }
}
