package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041615.
 * @author Sean A. Irvine
 */
public class A041615 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041615() {
    super(new long[] {-1, 0, 650, 0}, new long[] {1, 18, 649, 11700});
  }
}
