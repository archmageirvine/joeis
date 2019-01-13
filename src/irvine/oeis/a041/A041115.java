package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041115.
 * @author Sean A. Irvine
 */
public class A041115 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041115() {
    super(new long[] {-1, 0, 130, 0}, new long[] {1, 8, 129, 1040});
  }
}
