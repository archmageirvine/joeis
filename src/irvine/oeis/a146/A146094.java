package irvine.oeis.a146;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A146094 Bell numbers (A000110) mod 4.
 * @author Sean A. Irvine
 */
public class A146094 extends LinearRecurrence {

  /** Construct the sequence. */
  public A146094() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 1, 3, 0, 3, 1, 0, 3, 3, 2});
  }
}
