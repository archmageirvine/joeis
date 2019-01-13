package irvine.oeis.a259;

import irvine.oeis.LinearRecurrence;

/**
 * A259969.
 * @author Sean A. Irvine
 */
public class A259969 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259969() {
    super(new long[] {-1, 2, -5, 6, -6, 4}, new long[] {0, 1, 2, 9, 24, 50});
  }
}
