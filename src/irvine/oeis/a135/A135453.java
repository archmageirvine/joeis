package irvine.oeis.a135;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A135453 a(n) = 12*n^2.
 * @author Sean A. Irvine
 */
public class A135453 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135453() {
    super(new long[] {1, -3, 3}, new long[] {0, 12, 48});
  }
}
