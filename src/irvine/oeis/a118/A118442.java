package irvine.oeis.a118;

import irvine.oeis.LinearRecurrence;

/**
 * A118442.
 * @author Sean A. Irvine
 */
public class A118442 extends LinearRecurrence {

  /** Construct the sequence. */
  public A118442() {
    super(new long[] {-16, 0, -8, 0}, new long[] {0, 1, -4, -12});
  }
}
