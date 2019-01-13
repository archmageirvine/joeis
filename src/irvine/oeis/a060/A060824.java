package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060824.
 * @author Sean A. Irvine
 */
public class A060824 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060824() {
    super(new long[] {-1, 1, -1, 0, 0, 0, 3, -3, 3, -1, 1}, new long[] {2, 2, 2, 2, 4, 6, 8, 14, 18, 20, 38});
  }
}
