package irvine.oeis.a146;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A146098 Bell numbers (A000110) read mod 8.
 * @author Sean A. Irvine
 */
public class A146098 extends LinearRecurrence {

  /** Construct the sequence. */
  public A146098() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 5, 7, 4, 3, 5, 4, 3, 7, 2, 5, 5, 2, 1, 3, 4, 7, 1, 4, 7, 3, 2});
  }
}
