package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041799.
 * @author Sean A. Irvine
 */
public class A041799 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041799() {
    super(new long[] {-1, 0, 82, 0}, new long[] {1, 2, 81, 164});
  }
}
