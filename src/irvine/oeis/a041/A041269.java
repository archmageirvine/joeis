package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041269.
 * @author Sean A. Irvine
 */
public class A041269 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041269() {
    super(new long[] {-1, 0, 194, 0}, new long[] {1, 8, 193, 1552});
  }
}
