package irvine.oeis.a244;

import irvine.oeis.LinearRecurrence;

/**
 * A244892.
 * @author Sean A. Irvine
 */
public class A244892 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244892() {
    super(new long[] {1, 0, 0, 0, 0}, new long[] {5, 2, 5, 2, 5});
  }
}
