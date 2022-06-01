package irvine.oeis.a028;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A028118 Expansion of 1/((1-4x)(1-5x)(1-7x)(1-11x)).
 * @author Sean A. Irvine
 */
public class A028118 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028118() {
    super(new long[] {-1540, 1053, -259, 27}, new long[] {1, 27, 470, 6750});
  }
}
