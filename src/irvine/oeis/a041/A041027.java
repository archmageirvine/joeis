package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041027.
 * @author Sean A. Irvine
 */
public class A041027 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041027() {
    super(new long[] {-1, 0, 34, 0}, new long[] {1, 4, 33, 136});
  }
}
