package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135301.
 * @author Sean A. Irvine
 */
public class A135301 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135301() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {1, 5, 6, 22, 23, 59, 60});
  }
}
