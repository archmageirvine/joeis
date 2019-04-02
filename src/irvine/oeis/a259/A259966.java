package irvine.oeis.a259;

import irvine.oeis.LinearRecurrence;

/**
 * A259966 Total binary weight (cf. A000120) of all A005251(n) binary sequences of length n not containing any isolated 1's.
 * @author Sean A. Irvine
 */
public class A259966 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259966() {
    super(new long[] {-1, 2, -5, 6, -6, 4}, new long[] {0, 0, 2, 7, 16, 34});
  }
}
