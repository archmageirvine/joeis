package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055649 Integers in base 11 with each base 11 digit represented by 2 decimal digits.
 * @author Sean A. Irvine
 */
public class A055649 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055649() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 100});
  }
}
