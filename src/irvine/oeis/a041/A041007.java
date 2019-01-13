package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041007.
 * @author Sean A. Irvine
 */
public class A041007 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041007() {
    super(new long[] {-1, 0, 10, 0}, new long[] {1, 2, 9, 20});
  }
}
