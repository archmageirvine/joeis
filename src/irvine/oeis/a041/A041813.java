package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041813.
 * @author Sean A. Irvine
 */
public class A041813 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041813() {
    super(new long[] {-1, 0, 0, 0, 124, 0, 0, 0}, new long[] {1, 1, 2, 3, 122, 125, 247, 372});
  }
}
